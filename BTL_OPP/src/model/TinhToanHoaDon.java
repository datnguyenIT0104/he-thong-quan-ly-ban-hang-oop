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
public class TinhToanHoaDon extends HoaDon{
    private int tongSoMatHang;
    private float tongTienPhaiTra;

    public TinhToanHoaDon() {
    }

    public TinhToanHoaDon(int tongSoMatHang, float tongTienPhaiTra, KhachHang khach) {
        super(khach);
        this.tongSoMatHang = tongSoMatHang;
        this.tongTienPhaiTra = tongTienPhaiTra;
    }

    public int getTongSoMatHang() {
        return tongSoMatHang;
    }

    public void setTongSoMatHang(int tongSoMatHang) {
        this.tongSoMatHang = tongSoMatHang;
    }

    public float getTongTienPhaiTra() {
        return tongTienPhaiTra;
    }

    public void setTongTienPhaiTra(float tongTienPhaiTra) {
        this.tongTienPhaiTra = tongTienPhaiTra;
    }
    
}
