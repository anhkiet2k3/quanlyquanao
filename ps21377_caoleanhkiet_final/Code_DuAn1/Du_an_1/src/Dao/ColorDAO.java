package Dao;

import Entity.Color;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColorDAO extends DAO<Color, String> {

    @Override
    public void insert(Color entity) {
        String sql = "INSERT INTO Color (TenColor) VALUES (?)";
        XJdbc.update(sql,
                entity.getTenColor());
    }

    @Override
    public void update(Color entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Color> selectAll() {
        String sql = "SELECT * FROM COLOR";
        return this.selectBySql(sql);
    }

    @Override
    public Color selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Color> selectBySql(String sql, Object... args) {
        List<Color> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Color entity = new Color();
                    entity.setIDColor(rs.getInt("IDColor"));
                    entity.setTenColor(rs.getString("TenColor"));
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
    
    public void delete(int IDColor) {
        String sql = "delete from COLOR where IDColor=?";
        XJdbc.update(sql, IDColor);
    }

    public Color selectById(int IDColor) {
        String sql = "SELECT * FROM COLOR WHERE IDColor=?";
        List<Color> list = this.selectBySql(sql, IDColor);
        return list.size() > 0 ? list.get(0) : null;
    }

}
