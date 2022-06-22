/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.HoaDon;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
/**
 *
 * @author DatIT
 */
public class HoaDonDAO extends DAO{

    public HoaDonDAO() {
        super();
    }
    public boolean themHoaDon( HoaDon hd){
        boolean res = false;
        String sql = "INSERT INTO tblhoadon( dathanhtoan, thoigianlap, tblkhachhangid, khuyenmai) VALUES"
                + "( ? , ? , ?, ?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            int dTT;
            if( hd.isDaThanhToan()) dTT = 1;
            else dTT = 0;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "" + dTT);
            ps.setString(2, sdf.format(hd.getThoiGianMua()));
            ps.setString(3, "" + hd.getKhach().getId());
            ps.setString(4, hd.getKhuyenMai()+"");
            int count = ps.executeUpdate();
            if( count > 0) res = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        return res;
    }
}
