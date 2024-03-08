package Dao;

import Entity.DanhMuc;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DanhMucDAO extends DAO<DanhMuc, String> {

    @Override
    public void insert(DanhMuc entity) {
        String sql = "INSERT INTO DanhMuc (TenDanhMuc) VALUES (?)";
        XJdbc.update(sql,
                entity.getTenDanhMuc());
    }

    @Override
    public void update(DanhMuc entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DanhMuc> selectAll() {
        String sql = "SELECT * FROM DANHMUC";
        return this.selectBySql(sql);
    }

    @Override
    public DanhMuc selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<DanhMuc> selectBySql(String sql, Object... args) {
        List<DanhMuc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    DanhMuc entity = new DanhMuc();
                    entity.setIDDanhMuc(rs.getInt("IDDanhMuc"));
                    entity.setTenDanhMuc(rs.getString("TenDanhMuc"));
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

    public void delete(int IDDanhMuc) {
        String sql = "delete from DANHMUC where IDDanhMuc=?";
        XJdbc.update(sql, IDDanhMuc);
    }

    public DanhMuc selectById(int IDDanhMuc) {
        String sql = "SELECT * FROM DANHMUC WHERE IDDanhMuc=?";
        List<DanhMuc> list = this.selectBySql(sql, IDDanhMuc);
        return list.size() > 0 ? list.get(0) : null;
    }

}
