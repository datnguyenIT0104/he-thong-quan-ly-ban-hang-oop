/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.MatHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author DatIT
 */
public class MatHangDAO extends DAO{

    public MatHangDAO() {
        super();
    }
    public boolean themMatHang( MatHang mh){
        boolean res = false;
        String sql = "INSERT INTO tblmathang( ten, dongia, ghichu) VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mh.getTen());
            ps.setString(2, "" + mh.getDonGia());
            ps.setString(3, mh.getGhiChu());
            int count = ps.executeUpdate();
            if( count > 0) res = true;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return res;
    }
    public ArrayList<MatHang> layTatCaMatHang(){
        ArrayList<MatHang> list = new ArrayList<>();
        String sql = "SELECT id, ten, dongia, ghichu FROM tblmathang;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MatHang mh = new MatHang();
                mh.setId( rs.getInt(1));
                mh.setTen(rs.getString(2));
                mh.setDonGia( rs.getFloat(3));
                mh.setGhiChu(rs.getString(4));
                list.add(mh);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}
