/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author DatIT
 */
public abstract class KhachHang implements Serializable{
    private int id;
    private String hoTen, diaChi, nhomKhachHang;

    public KhachHang() {
    }

    public KhachHang(String nhomKhachHang) {
        this.nhomKhachHang = nhomKhachHang;
    }
    
    public KhachHang(int id, String hoTen, String diaChi, String nhomKhachHang) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.nhomKhachHang = nhomKhachHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract String getNhomKhachHang();

    public void setNhomKhachHang(String nhomKhachHang) {
        this.nhomKhachHang = nhomKhachHang;
    }
    public boolean kiemTraKhachHang( JTextField hoTenText, JTextField diaChiText, StringBuilder sb){
        
        if( hoTenText.getText().equals("")){
            sb.append("Không được để trống họ và tên\n");
            hoTenText.setBackground(Color.red);
        }else hoTenText.setBackground(Color.white);
        if( diaChiText.getText().equals("")){
            sb.append("Không được để trống địa chỉ\n");
            diaChiText.setBackground(Color.red);
        }else diaChiText.setBackground(Color.white);
        
        if( sb.length() > 0) return false;
        else return true;
    }
}
