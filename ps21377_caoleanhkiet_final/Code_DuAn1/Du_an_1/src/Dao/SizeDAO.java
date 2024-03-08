package Dao;

import Entity.Size;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SizeDAO extends DAO<Size, String> {

    @Override
    public void insert(Size entity) {
        String sql = "INSERT INTO SIZE (TenSize) VALUES (?)";
        XJdbc.update(sql,
                entity.getTenSize());
    }

    @Override
    public void update(Size entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Size> selectAll() {
        String sql = "SELECT * FROM SIZE";
        return this.selectBySql(sql);
    }

    @Override
    public Size selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<Size> selectBySql(String sql, Object... args) {
        List<Size> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Size entity = new Size();
                    entity.setIDSize(rs.getInt("IDSize"));
                    entity.setTenSize(rs.getString("TenSize"));
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
    public void delete(int IDSize) {
        String sql = "delete from SIZE where IDSize=?";
        XJdbc.update(sql, IDSize);
    }

    public Size selectById(int IDSize) {
        String sql = "SELECT * FROM SIZE WHERE IDSIZE=?";
        List<Size> list = this.selectBySql(sql, IDSize);
        return list.size() > 0 ? list.get(0) : null;
    }

}
