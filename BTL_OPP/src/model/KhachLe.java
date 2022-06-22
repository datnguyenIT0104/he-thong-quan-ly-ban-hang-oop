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
public class KhachLe extends KhachHang{

    public KhachLe(String nhomKhachHang) {
        super(nhomKhachHang);
    }

    public KhachLe(int id, String hoTen, String diaChi, String nhomKhachHang) {
        super(id, hoTen, diaChi, nhomKhachHang);
    }
    
    
    @Override
    public String getNhomKhachHang() {
        return "Khách lẻ";
    }
    
}
