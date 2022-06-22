/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author DatIT
 */
public class MatHang implements Serializable{
    private int id;
    private String ten, ghiChu;
    private float donGia;

    public MatHang() {
    }

    public MatHang(int id, String ten, String ghiChu, float donGia) {
        this.id = id;
        this.ten = ten;
        this.ghiChu = ghiChu;
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public boolean kiemTraMatHang( JTextField tenTex, JTextField donGiaTex, StringBuilder sb){
        
        if( tenTex.getText().equals("")){
            sb.append("Không được để trống tên mặt hàng\n");
            tenTex.setBackground(Color.red);
        }else tenTex.setBackground(Color.white);
        if( donGiaTex.getText().equals("")){
            sb.append("Không được để trống đơn giá của sản phẩm");
            donGiaTex.setBackground(Color.red);
        }else if( Float.parseFloat( donGiaTex.getText()) <= 0){
            sb.append("Giá mặt hàng phải lớn hơn 0");
            donGiaTex.setBackground(Color.red);
        }else  donGiaTex.setBackground(Color.white);
        
        if( sb.length() > 0) return false;
        else return true;
    }
}
