/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Dao.ChatLieuDAO;
import Dao.ChiTietSanPhamDAO;
import Dao.ColorDAO;
import Dao.SizeDAO;
import Entity.ChatLieu;
import Entity.ChiTietSanPham;
import Entity.Color;
import Entity.Size;
import Util.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tri03
 */
public class ChiTietSanPhamJpanel extends javax.swing.JPanel {

    /**
     * Creates new form MathangJpannel
     */
    public ChiTietSanPhamJpanel() {
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

        btgTrangThai = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietSanPham = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtMaCTSP = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        txtTenCTSP = new javax.swing.JTextField();
        cboSize = new javax.swing.JComboBox<>();
        cboMau = new javax.swing.JComboBox<>();
        cboChatLieu = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnTaoMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        rdoDangKinhDoanh = new javax.swing.JRadioButton();
        rdoNgungKinhDoanh = new javax.swing.JRadioButton();
        lblTrangThai = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblChiTietSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã CTSP", "Mã SP ", "TenCTSP", "Mã Size", "Mã Màu", "Mã Chất Liệu", "Số lượng", "Giá", "Trạng thái"
            }
        ));
        tblChiTietSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChiTietSanPham);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Tìm kiếm  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 153, 0))); // NOI18N
        txtTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTimKiem.setFocusTraversalPolicyProvider(true);
        txtTimKiem.setPreferredSize(new java.awt.Dimension(300, 40));
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });
        jPanel1.add(txtTimKiem);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Thêm chi tiết sản phẩm   ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        txtMaCTSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Mã chi tiết sản phẩm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtMaSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Mã sản phẩm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtTenCTSP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tên CTSP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        cboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSize.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), " Size", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        cboMau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMau.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "Màu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        cboChatLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChatLieu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), " Chất liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtSoLuong.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Số lượng ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        txtGia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Giá ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 102, 102))); // NOI18N

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

        rdoDangKinhDoanh.setBackground(new java.awt.Color(255, 255, 255));
        btgTrangThai.add(rdoDangKinhDoanh);
        rdoDangKinhDoanh.setText("Đang kinh doanh");

        rdoNgungKinhDoanh.setBackground(new java.awt.Color(255, 255, 255));
        btgTrangThai.add(rdoNgungKinhDoanh);
        rdoNgungKinhDoanh.setText("Ngừng kinh doanh");

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(0, 102, 102));
        lblTrangThai.setText("Trạng thái");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenCTSP)
                            .addComponent(cboSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboChatLieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)
                            .addComponent(txtGia)
                            .addComponent(txtMaSP)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdoDangKinhDoanh)
                                        .addGap(6, 6, 6)
                                        .addComponent(rdoNgungKinhDoanh))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addComponent(txtMaCTSP))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboMau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTrangThai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoDangKinhDoanh)
                    .addComponent(rdoNgungKinhDoanh))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblChiTietSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietSanPhamMouseClicked
        // TODO add your handling code here:
        this.rowctsp = tblChiTietSanPham.getSelectedRow();
        editChiTietSanPham();
    }//GEN-LAST:event_tblChiTietSanPhamMouseClicked

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        clearFormChiTietSanPham();
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insertChiTietSanPham();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        deleteChiTietSanPham();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        updateChiTietSanPham();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        searchSanPham();
    }//GEN-LAST:event_txtTimKiemKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTrangThai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChatLieu;
    private javax.swing.JComboBox<String> cboMau;
    private javax.swing.JComboBox<String> cboSize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JRadioButton rdoDangKinhDoanh;
    private javax.swing.JRadioButton rdoNgungKinhDoanh;
    private javax.swing.JTable tblChiTietSanPham;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaCTSP;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenCTSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    private void init() {
        fillTableChiTietSanPham();
        fillComboBoxSize();
        fillComboBoxMau();
        fillComboBoxChatLieu();

    }
    // ==========================SẢN PHẨM===============================
    int rowctsp = -1;
    ChiTietSanPhamDAO daoctsp = new ChiTietSanPhamDAO();
    SizeDAO daos = new SizeDAO();
    ColorDAO daom = new ColorDAO();
    ChatLieuDAO daocl = new ChatLieuDAO();

    private void fillComboBoxSize() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSize.getModel();
        model.removeAllElements();
        List<Size> lists = daos.selectAll();
        for (Size s : lists) {
            model.addElement(s.getIDSize());
        }
    }

    private void fillComboBoxMau() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMau.getModel();
        model.removeAllElements();
        List<Color> listm = daom.selectAll();
        for (Color m : listm) {
            model.addElement(m.getIDColor());
        }
    }

    private void fillComboBoxChatLieu() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChatLieu.getModel();
        model.removeAllElements();
        List<ChatLieu> listcl = daocl.selectAll();
        for (ChatLieu cl : listcl) {
            model.addElement(cl.getIDChatLieu());
        }
    }

    private void fillTableChiTietSanPham() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietSanPham.getModel();
        model.setRowCount(0);
        try {
            List<ChiTietSanPham> listctsp = daoctsp.selectAll();
            for (ChiTietSanPham ctsp : listctsp) {
                Object[] row = {
                    ctsp.getIDCTSanPham(),
                    ctsp.getIDSanPham(),
                    ctsp.getTenCTSP(),
                    ctsp.getIDSize(),
                    ctsp.getIDColor(),
                    ctsp.getIDChatLieu(),
                    ctsp.getSoLuong(),
                    ctsp.getGia(),
                    ctsp.isTrangThai() ? "Đang kinh doanh" : "Ngừng kinh doanh"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    private void clearFormChiTietSanPham() {
        txtMaCTSP.setText("");
        txtMaSP.setText("");
        txtTenCTSP.setText("");
        cboSize.setSelectedIndex(0);
        cboMau.setSelectedIndex(0);
        cboChatLieu.setSelectedIndex(0);
        txtSoLuong.setText("");
        txtGia.setText("");
        rdoDangKinhDoanh.setSelected(true);
    }

    ChiTietSanPham getFormChiTietSanPham() {
        ChiTietSanPham ctsp = new ChiTietSanPham();
        ctsp.setIDCTSanPham(txtMaCTSP.getText());
        ctsp.setIDSanPham(txtMaSP.getText());
        ctsp.setTenCTSP(txtTenCTSP.getText());
        ctsp.setIDSize((int) cboSize.getSelectedItem());
        ctsp.setIDColor((int) cboMau.getSelectedItem());
        ctsp.setIDChatLieu((int) cboChatLieu.getSelectedItem());
        ctsp.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        ctsp.setGia(Double.parseDouble(txtGia.getText()));
        ctsp.setTrangThai(rdoDangKinhDoanh.isSelected());
        return ctsp;
    }

    private void setFormChiTietSanPham(ChiTietSanPham ctsp) {
        txtMaCTSP.setText(String.valueOf(ctsp.getIDCTSanPham()));
        txtMaSP.setText(String.valueOf(ctsp.getIDSanPham()));
        txtTenCTSP.setText(String.valueOf(ctsp.getTenCTSP()));
        cboSize.setSelectedItem(String.valueOf(ctsp.getIDSize()));
        cboMau.setSelectedItem(String.valueOf(ctsp.getIDColor()));
        cboChatLieu.setSelectedItem(String.valueOf(ctsp.getIDChatLieu()));
        txtSoLuong.setText(String.valueOf(ctsp.getSoLuong()));
        txtGia.setText(String.valueOf(ctsp.getGia()));
        if (ctsp.isTrangThai()) {
            rdoDangKinhDoanh.setSelected(true);
        } else {
            rdoNgungKinhDoanh.setSelected(true);
        }
    }

    private void editChiTietSanPham() {
        String idctsp = (String) tblChiTietSanPham.getValueAt(rowctsp, 0);
        ChiTietSanPham ctsp = daoctsp.selectById(idctsp);
        setFormChiTietSanPham(ctsp);
    }

    private void insertChiTietSanPham() {
        if (isValidatedChiTietSanPham()) {
            ChiTietSanPham ctsp = getFormChiTietSanPham();
            try {
                daoctsp.insert(ctsp);
                fillTableChiTietSanPham();
                MsgBox.alert(this, "Thêm thành công!");
                clearFormChiTietSanPham();
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm thất bại!");
            }
        }
    }

    private void deleteChiTietSanPham() {
        try {
            String idctsp = (String) tblChiTietSanPham.getValueAt(rowctsp, 0);
            ChiTietSanPham ctsp = daoctsp.selectById(idctsp);
            daoctsp.delete(idctsp);
            fillTableChiTietSanPham();
            clearFormChiTietSanPham();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
        }
    }

    private void updateChiTietSanPham() {
        if (isValidatedChiTietSanPham()) {
            ChiTietSanPham ctsp = getFormChiTietSanPham();
            try {
                daoctsp.update(ctsp);
                fillTableChiTietSanPham();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    private void searchSanPham() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietSanPham.getModel();
        model.setRowCount(0);
        try {
            String timkiem = txtTimKiem.getText();
            List<ChiTietSanPham> list = daoctsp.selectTimKiem(timkiem);
            for (ChiTietSanPham ctsp : list) {
                Object[] row = {
                    ctsp.getIDCTSanPham(),
                    ctsp.getIDSanPham(),
                    ctsp.getTenCTSP(),
                    ctsp.getIDSize(),
                    ctsp.getIDColor(),
                    ctsp.getIDChatLieu(),
                    ctsp.getSoLuong(),
                    ctsp.getGia(),
                    ctsp.isTrangThai() ? "Đang kinh doanh" : "Ngừng kinh doanh"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    boolean isValidatedChiTietSanPham() {
        if (txtMaCTSP.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống mã chi tiết sản phẩm!");
            return false;
        }
        if (txtMaSP.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống mã sản phẩm!");
            return false;
        }
        if (txtTenCTSP.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống tên sản chi tiết sản phẩm!");
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
        try {
            if (txtGia.getText().isEmpty()) {
                MsgBox.alert(this, "Không để trống giá trị!");
                return false;
            }
            double number = Double.parseDouble(txtGia.getText());
            if (number < 0) {
                MsgBox.alert(this, "Số số giá trị không được là số âm!");
                return false;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Giá trị không hợp lệ!!!");
            return false;
        }

        return true;
    }
}