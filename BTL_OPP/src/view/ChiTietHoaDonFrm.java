/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ViecMuaHangDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.TinhToanHoaDon;
import model.ViecMuaHang;

/**
 *
 * @author DatIT
 */
public class ChiTietHoaDonFrm extends javax.swing.JFrame {
    private TinhToanHoaDon tthd;
    private int moduleLapBangKe;
    /**
     * Creates new form ChiTietHoaDonFrm
     */
    public ChiTietHoaDonFrm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public ChiTietHoaDonFrm(TinhToanHoaDon tthd, int moduleLapBangKe) {
        this.moduleLapBangKe = moduleLapBangKe;
        this.tthd = tthd;
        initComponents();
        initTable();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labTenKhach = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labThoiGianLap = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViecMuaHang = new javax.swing.JTable();
        btnTrangChu = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labTongTien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labSoLuongSp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chi ti???t h??a ????n");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("PH???N M???M QU???N L?? B??N H??NG");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("T??n kh??ch h??ng:");

        labTenKhach.setText("\"T??n Kh??ch\"");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Th???i gian l???p h??a ????n:");

        labThoiGianLap.setText("Th???i gian l???p");

        tblViecMuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblViecMuaHang);

        btnTrangChu.setText("Trang Ch???");
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay L???i");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("T???ng ti???n ph???i tr???:");

        labTongTien.setText("\"Ti???n\"");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("T???ng s??? l?????ng s???n ph???m");

        labSoLuongSp.setText("S??? l????ng ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(labTenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labThoiGianLap, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(labSoLuongSp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labTenKhach)
                    .addComponent(jLabel6)
                    .addComponent(labThoiGianLap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labSoLuongSp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labTongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrangChu)
                    .addComponent(btnQuayLai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        (new TrangChuFrm()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        ( new SapXepHoaDonFrm(tthd.getKhach(), moduleLapBangKe)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    
    private void initTable(){
        
        float tongTien = 0;
        
        // kh???i t???o b???ng
        DefaultTableModel model = new DefaultTableModel();
        String[] Colums = new String[]{
            "STT", "M?? M???T H??NG", "T??N", "????N GI??", "S??? L?????NG", "KHUY???N M??I", "TH??NH TI???N", "GHI CH??"
        };
        model.setColumnIdentifiers(Colums);
        // l???y d??? li???u t??? csdl
        ArrayList<ViecMuaHang> list = new ArrayList<>();
        ViecMuaHangDAO vmhD = new ViecMuaHangDAO();
        list = vmhD.layViecMuaHang(tthd);
        tthd.setListVMH(list);
        // l???y d??? li???u v??o model
        int index = 1, tongSL = 0;
        for (ViecMuaHang viecMuaHang : tthd.getListVMH()) {
            model.addRow(new Object[]{
                index++, viecMuaHang.getMatHang().getId(), viecMuaHang.getMatHang().getTen(),
                viecMuaHang.getMatHang().getDonGia(), viecMuaHang.getSoLuong(), tthd.getKhuyenMai()*100 +"%",
                viecMuaHang.getSoLuong()*viecMuaHang.getMatHang().getDonGia()*(1 - tthd.getKhuyenMai()), viecMuaHang.getGhiChu()
            });
            tongTien += viecMuaHang.getSoLuong()*viecMuaHang.getMatHang().getDonGia()*(1 - tthd.getKhuyenMai());
            tongSL += viecMuaHang.getSoLuong();
        }
        tblViecMuaHang.setModel(model);
        
        // kh???i t???o th??ng tin
        labTenKhach.setText(tthd.getKhach().getHoTen());
        labSoLuongSp.setText("" + tongSL);
        labTongTien.setText("" + tongTien);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/YYYY");
        labThoiGianLap.setText( sdf.format( tthd.getThoiGianMua()));
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labSoLuongSp;
    private javax.swing.JLabel labTenKhach;
    private javax.swing.JLabel labThoiGianLap;
    private javax.swing.JLabel labTongTien;
    private javax.swing.JTable tblViecMuaHang;
    // End of variables declaration//GEN-END:variables
}
