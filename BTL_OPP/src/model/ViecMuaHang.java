/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author DatIT
 */
public class ViecMuaHang implements Serializable{
    private int id, soLuong;
    private float thanhTien;
    private String ghiChu;
    private MatHang matHang;

    public ViecMuaHang() {
    }

    public ViecMuaHang(int id, int soLuong, float thanhTien, String ghiChu, MatHang matHang) {
        this.id = id;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ghiChu = ghiChu;
        this.matHang = matHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }
    
}
