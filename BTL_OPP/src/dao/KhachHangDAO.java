/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.KhachBuon;
import model.KhachLe;
import model.KhachOnline;
/**
 *
 * @author DatIT
 */
public class KhachHangDAO extends DAO{

    public KhachHangDAO() {
        super();
    }
    public boolean themKhachHang( KhachHang kh){
        boolean res = false;
        String sql = "insert into tblkhachhang(hoten, diachi, nhomkhachhang) values( ?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kh.getHoTen());
            ps.setString(2, kh.getDiaChi());
            ps.setString(3, kh.getNhomKhachHang());
            ps.executeUpdate();
            res = true;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        return res;
    }
    
    public ArrayList<KhachHang> layTatCaKhachHang(){
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT id, hoten, diachi, nhomkhachhang FROM tblkhachhang";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                KhachHang kh;
                if( rs.getString(4).equalsIgnoreCase("Khách lẻ")) kh = new KhachLe(rs.getString(4));
                else if( rs.getString(4).equalsIgnoreCase("Khách buôn")) kh = new KhachBuon(rs.getString(4));
                else kh = new KhachOnline(rs.getString(4));
                
                kh.setId( rs.getInt(1));
                kh.setHoTen(rs.getString("hoten"));
                kh.setDiaChi(rs.getString("diachi"));
                
                list.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        return list;
    }
}
