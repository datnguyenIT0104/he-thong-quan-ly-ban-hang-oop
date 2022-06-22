/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.HoaDon;
import model.ViecMuaHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.MatHang;
import model.TinhToanHoaDon;

/**
 *
 * @author DatIT
 */
public class ViecMuaHangDAO extends DAO{

    public ViecMuaHangDAO() {
        super();
    }
    public boolean themViecMuaHang(HoaDon hoaDon){
        boolean res= false;
        String sql = "INSERT INTO tblviecmuahang( soluong,tblmathangid, tblhoadonid)\n" +
                    "VALUES ( ?, ?, ( SELECT id \n" +
                    "                       FROM tblhoadon\n" +
                    "                        WHERE thoigianlap = ?));";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        for (ViecMuaHang vMuaHang : hoaDon.getListVMH()) {
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,""+ vMuaHang.getSoLuong());
                ps.setInt(2, vMuaHang.getMatHang().getId());
                ps.setString(3, sdf.format(hoaDon.getThoiGianMua()));
                int count = ps.executeUpdate();
                if( count > 0) res = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return res;
    }
    
    public ArrayList<ViecMuaHang> layViecMuaHang(TinhToanHoaDon tthd){
        ArrayList<ViecMuaHang> res = new ArrayList<>();
        String sql = "SELECT b.id, b.ten, b.dongia, a.soluong\n" +
"                       FROM tblviecmuahang as a, tblmathang as b\n" +
"                       WHERE a.tblhoadonid = ?\n" +
"                       AND a.tblmathangid = b.id;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tthd.getId());
            ResultSet rs = ps.executeQuery();
            while( rs.next()){
                MatHang mh = new MatHang( rs.getInt(1), rs.getString(2), "",rs.getFloat(3));
                
                ViecMuaHang vmh = new ViecMuaHang();
                vmh.setMatHang(mh);
                vmh.setSoLuong( rs.getInt(4));
                res.add(vmh);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }
}
