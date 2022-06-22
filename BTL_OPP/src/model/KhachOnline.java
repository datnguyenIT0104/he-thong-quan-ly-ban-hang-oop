/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DatIT
 */
public class KhachOnline extends KhachHang{

    public KhachOnline(String nhomKhachHang) {
        super(nhomKhachHang);
    }

    public KhachOnline(int id, String hoTen, String diaChi, String nhomKhachHang) {
        super(id, hoTen, diaChi, nhomKhachHang);
    }

    @Override
    public String getNhomKhachHang() {
        return "Khách mua online";
    }
    
}
