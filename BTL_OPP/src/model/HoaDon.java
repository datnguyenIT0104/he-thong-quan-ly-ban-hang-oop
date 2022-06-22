/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DatIT
 */
public class HoaDon implements Serializable{
    private int id, soLuongSanPham;
    private Date thoiGianMua;
    private boolean daThanhToan;
    private float khuyenMai;
    private ArrayList<ViecMuaHang> listVMH = new ArrayList<>();
    private KhachHang khach;

    public HoaDon(){
        
    }
    
    public HoaDon(KhachHang khach) {
        this.khach = khach;
    }
    
    public HoaDon(int id, Date thoiGianMua, boolean daThanhToan, float khuyenMai, ArrayList<ViecMuaHang> listVMH, KhachHang khach) {
        this.id = id;
        this.thoiGianMua = thoiGianMua;
        this.daThanhToan = daThanhToan;
        this.khuyenMai = khuyenMai;
        this.listVMH = listVMH;
        this.khach = khach;
    }
    
    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getThoiGianMua() {
        return thoiGianMua;
    }

    public void setThoiGianMua(Date thoiGianMua) {
        this.thoiGianMua = thoiGianMua;
    }

    public boolean isDaThanhToan() {
        return daThanhToan;
    }

    public void setDaThanhToan(boolean daThanhToan) {
        this.daThanhToan = daThanhToan;
    }

    public float getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(float khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public ArrayList<ViecMuaHang> getListVMH() {
        return listVMH;
    }

    public void setListVMH(ArrayList<ViecMuaHang> listVMH) {
        this.listVMH = listVMH;
    }

    public KhachHang getKhach() {
        return khach;
    }

    public void setKhach(KhachHang khach) {
        this.khach = khach;
    }
    
    
    
    
    public void tinhKhuyenMai(){
        if( khach.getNhomKhachHang().equals("Khách lẻ")){
            khuyenMai = 0;
        }else if( khach.getNhomKhachHang().equals("Khách buôn")){
            khuyenMai = 0.05f;
        }else khuyenMai = 0.02f;
    }
}
