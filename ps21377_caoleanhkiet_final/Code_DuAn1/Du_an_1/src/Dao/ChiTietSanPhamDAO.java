/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.ChiTietSanPham;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tri03
 */
public class ChiTietSanPhamDAO extends DAO<ChiTietSanPham, String> {

    @Override
    public void insert(ChiTietSanPham entity) {
        String sql = "INSERT INTO CHITIETSANPHAM(IDCTSanPham, IDSanPham, TenCTSP, IDSize, IDColor, IDChatLieu, SoLuong, Gia, TrangThai) VALUES (?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getIDCTSanPham(),
                entity.getIDSanPham(),
                entity.getTenCTSP(),
                entity.getIDSize(),
                entity.getIDColor(),
                entity.getIDChatLieu(),
                entity.getSoLuong(),
                entity.getGia(),
                entity.isTrangThai());
    }

    @Override
    public void update(ChiTietSanPham entity) {
        String sql = "UPDATE CHITIETSANPHAM SET IDSanPham=?, TenCTSP=?, IDSize=?, IDColor=?, IDChatLieu=?, SoLuong=?, Gia=?, TrangThai=? WHERE IDCTSanPham=?";
        XJdbc.update(sql,
                entity.getIDSanPham(),
                entity.getTenCTSP(),
                entity.getIDSize(),
                entity.getIDColor(),
                entity.getIDChatLieu(),
                entity.getSoLuong(),
                entity.getGia(),
                entity.isTrangThai(),
                entity.getIDCTSanPham());
    }

    @Override
    public void delete(String IDCTSanPham) {
        String sql = "delete from CHITIETSANPHAM where IDCTSanPham=?";
        XJdbc.update(sql, IDCTSanPham);
    }

    @Override
    public List<ChiTietSanPham> selectAll() {
        String sql = "SELECT * FROM CHITIETSANPHAM";
        return this.selectBySql(sql);
    }

    @Override
    public ChiTietSanPham selectById(String IDCTSanPham) {
        String sql = "SELECT * FROM CHITIETSANPHAM WHERE IDCTSanPham=?";
        List<ChiTietSanPham> list = this.selectBySql(sql, IDCTSanPham);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<ChiTietSanPham> selectBySql(String sql, Object... args) {
        List<ChiTietSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ChiTietSanPham entity = new ChiTietSanPham();
                    entity.setIDCTSanPham(rs.getString("IDCTSanPham"));
                    entity.setIDSanPham(rs.getString("IDSanPham"));
                    entity.setTenCTSP(rs.getString("TenCTSP"));
                    entity.setIDSize(rs.getInt("IDSize"));
                    entity.setIDColor(rs.getInt("IDColor"));
                    entity.setIDChatLieu(rs.getInt("IDChatLieu"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setGia(rs.getDouble("Gia"));
                    entity.setTrangThai(rs.getBoolean("TrangThai"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    public List<ChiTietSanPham> selectTimKiem(String TenCTSP) {
       String sql="SELECT * FROM CHITIETSANPHAM WHERE TenCTSP LIKE ?";
        return this.selectBySql(sql, "%"+TenCTSP+"%");
    }

}
