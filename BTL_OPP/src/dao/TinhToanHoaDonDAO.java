/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.TinhToanHoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import model.HoaDon;
import model.KhachBuon;
import model.KhachHang;
import model.KhachLe;
import model.KhachOnline;
/**
 *
 * @author DatIT
 */
public class TinhToanHoaDonDAO extends DAO{

    public TinhToanHoaDonDAO() {
        super();
    }
    public ArrayList<TinhToanHoaDon> layTinhToanHoaDon(){
        ArrayList<TinhToanHoaDon> res = new ArrayList<>();
        try {
            String sql = "SELECT a.id, b.hoten, b.nhomkhachhang as nhomKH,a.thoigianlap, a.khuyenmai, (SELECT SUM(c.soluong)\n" +
"                                                    FROM tblviecmuahang as c\n" +
"                                                    WHERE c.tblhoadonid = a.id) as tongMatHang,\n" +
"                                                    ( SELECT SUM( d.dongia*c.soluong * (1 - a.khuyenmai))\n" +
"                                                       FROM tblviecmuahang as c, tblmathang as d\n" +
"                                                      WHERE c.tblhoadonid = a.id\n" +
"                                                      AND c.tblmathangid = d.id\n" +
"                                                      ) as tongTien\n" +
"                       FROM tblhoadon as a, tblkhachhang as b\n" +
"                       WHERE a.tblkhachhangid = b.id;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                TinhToanHoaDon ttHD = new TinhToanHoaDon();
                ttHD.setId( rs.getInt(1));
                
                // đóng gói dữ liệu Khách hàng
                KhachHang kh;
                String loaiKh = rs.getString(3);
                switch (loaiKh) {
                    case "Khách lẻ":
                        kh = new KhachLe(loaiKh);
                        break;
                    case "Khách buôn":
                        kh = new KhachBuon(loaiKh);
                        break;
                    default:
                        kh = new KhachOnline(loaiKh);
                        break;
                }
                kh.setHoTen(rs.getString(2));
                
                // đóng gói dữ liệu Hóa đơn
                ttHD.setKhach(kh);
                ttHD.setThoiGianMua( rs.getTimestamp(4));
                ttHD.setKhuyenMai(rs.getFloat(5));
                
                ttHD.setTongSoMatHang( rs.getInt(6));
                ttHD.setTongTienPhaiTra( rs.getFloat(7));
                res.add(ttHD);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<TinhToanHoaDon> layTinhToanHoaDon(KhachHang kh){
        ArrayList<TinhToanHoaDon> res = new ArrayList<>();
        try {
            String sql = "SELECT a.id, a.thoigianlap , a.khuyenmai, (SELECT SUM(c.soluong)\n" +
"                                                    FROM tblviecmuahang as c\n" +
"                                                    WHERE c.tblhoadonid = a.id) as tongMatHang,\n" +
"                                                    ( SELECT SUM( d.dongia*c.soluong * (1 - a.khuyenmai))\n" +
"                                                       FROM tblviecmuahang as c, tblmathang as d\n" +
"                                                      WHERE c.tblhoadonid = a.id\n" +
"                                                      AND c.tblmathangid = d.id\n" +
"                                                      ) as tongTien\n" +
"                       FROM tblhoadon as a\n" +
"                       WHERE a.tblkhachhangid = ?;";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, kh.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                TinhToanHoaDon ttHD = new TinhToanHoaDon();
                ttHD.setId( rs.getInt(1));
                
                
                // đóng gói dữ liệu Hóa đơn
                ttHD.setKhach(kh);
                ttHD.setThoiGianMua( rs.getTimestamp(2));
                ttHD.setKhuyenMai(rs.getFloat(3));
                
                ttHD.setTongSoMatHang( rs.getInt(4));
                ttHD.setTongTienPhaiTra( rs.getFloat(5));
                res.add(ttHD);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }
}
