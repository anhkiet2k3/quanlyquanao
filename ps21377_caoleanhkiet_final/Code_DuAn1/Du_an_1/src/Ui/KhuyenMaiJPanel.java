/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Dao.VoucherDAO;
import Entity.Voucher;
import Util.MsgBox;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tri03
 */
public class KhuyenMaiJPanel extends javax.swing.JPanel {

    /**
     * Creates new form KhuyenMaiJPanel
     */
    public KhuyenMaiJPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtMaVoucher = new javax.swing.JTextField();
        txtTenVoucher = new javax.swing.JTextField();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        txtNgayBatDau = new javax.swing.JTextField();
        txtGiaTri = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Tìm kiếm  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 0))); // NOI18N
        txtTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTimKiem.setFocusTraversalPolicyProvider(true);
        txtTimKiem.setPreferredSize(new java.awt.Dimension(300, 40));
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel1.add(txtTimKiem);

        tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã voucher", "Tên voucher", "Giá trị", "Ngày bắt đầu", "Ngày kết thúc", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(tblVoucher);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Thêm voucher ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        txtMaVoucher.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Mã voucher ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtTenVoucher.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tên voucher ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtNgayKetThuc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Ngày kết thúc ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/them_32.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTaoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tao_moi_32.png"))); // NOI18N
        btnTaoMoi.setText("Tạo mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xoa_32.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sua_32.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        txtNgayBatDau.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ngày bắt đầu ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtGiaTri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Giá trị ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtSoLuong.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Số lượng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(txtNgayBatDau)
                    .addComponent(txtTenVoucher)
                    .addComponent(txtNgayKetThuc)
                    .addComponent(txtMaVoucher)
                    .addComponent(txtGiaTri)
                    .addComponent(txtSoLuong))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnTaoMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        searchKhuyenMai();

    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insertKhuyenMai();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        clearFormKhuyenMia();
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        deleteKhuyenMai();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        updateKhuyenMai();
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVoucher;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMaVoucher;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenVoucher;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
 // ==========================KHUYẾN MÃI===============================
    private void init() {
        fillTableKhuyenMai();
    }

    int rowkm = 1;
    VoucherDAO daokm = new VoucherDAO();

    private void fillTableKhuyenMai() {
        DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
        model.setRowCount(0);
        try {
            List<Voucher> listkm = daokm.selectAll();
            for (Voucher km : listkm) {
                Object[] row = {
                    km.getIDVoucher(),
                    km.getTenVoucher(),
                    km.getGiaTri(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getSoLuong()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void clearFormKhuyenMia() {
        txtMaVoucher.setText("");
        txtTenVoucher.setText("");
        txtGiaTri.setText("");
        txtNgayBatDau.setText("");
        txtNgayKetThuc.setText("");
        txtSoLuong.setText("");
    }

    Voucher getFormKhuyenMai() {
        Voucher km = new Voucher();
        km.setIDVoucher(txtMaVoucher.getText());
        km.setTenVoucher(txtTenVoucher.getText());
        km.setGiaTri(Double.parseDouble(txtGiaTri.getText()));
        km.setNgayBatDau(txtNgayBatDau.getText());
        km.setNgayKetThuc(txtNgayKetThuc.getText());
        km.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        return km;
    }

    private void setFormKhuyenMai(Voucher km) {
        txtMaVoucher.setText(String.valueOf(km.getIDVoucher()));
        txtTenVoucher.setText(String.valueOf(km.getTenVoucher()));
        txtGiaTri.setText(String.valueOf(km.getGiaTri()));
        txtNgayBatDau.setText(String.valueOf(km.getNgayBatDau()));
        txtNgayKetThuc.setText(String.valueOf(km.getNgayKetThuc()));
        txtSoLuong.setText(String.valueOf(km.getSoLuong()));
    }

    private void editKhuyenMai() {
        String idkm = (String) tblVoucher.getValueAt(rowkm, 0);
        Voucher km = daokm.selectById(idkm);
        setFormKhuyenMai(km);
    }

    private void deleteKhuyenMai() {
        try {
            String idkm = (String) tblVoucher.getValueAt(rowkm, 0);
            Voucher km = daokm.selectById(idkm);
            daokm.delete(idkm);
            fillTableKhuyenMai();
            clearFormKhuyenMia();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
        }
    }

    private void insertKhuyenMai() {
        if (isValidatedKhuyenMai()) {
            Voucher km = getFormKhuyenMai();
            try {
                daokm.insert(km);
                fillTableKhuyenMai();
                MsgBox.alert(this, "Thêm thành công!");
                clearFormKhuyenMia();
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm thất bại!");
            }
        }
    }

    private void updateKhuyenMai() {
        if (isValidatedKhuyenMai()) {
            Voucher km = getFormKhuyenMai();
            try {
                daokm.update(km);
                fillTableKhuyenMai();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    private void searchKhuyenMai() {
        DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
        model.setRowCount(0);
        try {
            String timkiem = txtTimKiem.getText();
            List<Voucher> listkm = daokm.selectTimKiem(timkiem);
            for (Voucher km : listkm) {
                Object[] row = {
                    km.getIDVoucher(),
                    km.getTenVoucher(),
                    km.getGiaTri(),
                    km.getNgayBatDau(),
                    km.getNgayKetThuc(),
                    km.getSoLuong()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    boolean isValidatedKhuyenMai() {
        if (txtMaVoucher.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống mã Voucher!");
            return false;
        }
        if (txtTenVoucher.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống tên Voucher!");
            return false;
        }
        try {
            if (txtGiaTri.getText().isEmpty()) {
                MsgBox.alert(this, "Không để trống giá trị!");
                return false;
            }
            double number = Double.parseDouble(txtGiaTri.getText());
            if (number < 0) {
                MsgBox.alert(this, "Số số giá trị không được là số âm!");
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Giá trị không hợp lệ!!!");
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd-MM-yyyy");
        try {
            if (txtNgayBatDau.getText().isEmpty()) {
                MsgBox.alert(this, "Không để trống ngày bắt đầu!");
                return false;
            }
            Date date = sdf.parse(txtNgayBatDau.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Ngay khong hop le");
            return false;
        }
        try {
            if (txtNgayKetThuc.getText().isEmpty()) {
                MsgBox.alert(this, "Không để trống ngày kết thúc!");
                return false;
            }
            Date date = sdf.parse(txtNgayKetThuc.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Ngay khong hop le");
            return false;
        }
        try {
            if (txtSoLuong.getText().isEmpty()) {
                MsgBox.alert(this, "Không để trống số lượng!");
                return false;
            }
            double number = Double.parseDouble(txtSoLuong.getText());
            if (number < 0) {
                MsgBox.alert(this, "Số lượng không được là số âm!");
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lượng không hợp lệ!!!");
            return false;
        }

        return true;
    }

}
