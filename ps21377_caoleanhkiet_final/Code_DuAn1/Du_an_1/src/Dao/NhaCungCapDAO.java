/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.NhaCungCap;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tri03
 */
public class NhaCungCapDAO extends DAO<NhaCungCap, String> {

    @Override
    public void insert(NhaCungCap entity) {
        String sql = "INSERT INTO NHACUNGCAP(IDNCC, TENNCC, SDT, DIACHI) VALUES (?,?,?,?)";
        XJdbc.update(sql, entity.getIDNCC(), entity.getTenNCC(), entity.getSDT(), entity.getDiaChi());
    }

    @Override
    public void update(NhaCungCap entity) {
        String sql = "UPDATE NhaCungCap SET TenNCC=?, SDT=?, DiaChi=? WHERE IDNCC=?";
        XJdbc.update(sql,
                entity.getTenNCC(),
                entity.getSDT(),
                entity.getDiaChi(),
                entity.getIDNCC());
    }

    @Override
    public void delete(String IDNCC) {
        String sql = "delete from NHACUNGCAP where IDNCC=?";
        XJdbc.update(sql, IDNCC);
    }

    @Override
    public List<NhaCungCap> selectAll() {
        String sql = "SELECT * FROM NHACUNGCAP";
        return this.selectBySql(sql);
    }

    @Override
    public NhaCungCap selectById(String IDNCC) {
        String sql = "SELECT * FROM NHACUNGCAP WHERE IDNCC=?";
        List<NhaCungCap> list = this.selectBySql(sql, IDNCC);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    NhaCungCap entity = new NhaCungCap();
                    entity.setIDNCC(rs.getString("IDNCC"));
                    entity.setTenNCC(rs.getString("TenNCC"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setDiaChi(rs.getString("DiaChi"));
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

}
