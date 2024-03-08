package Dao;

import Entity.SanPham;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO extends DAO<SanPham, String> {

    @Override
    public void insert(SanPham entity) {
        String sql = "INSERT INTO SANPHAM(IDSanPham, TeNSanPham, IDNCC, IDDanhMuc, Mota) VALUES (?,?,?,?,?)";
        XJdbc.update(sql, 
                entity.getIDSanPham(), 
                entity.getTenSanPham(), 
                entity.getIDNCC(), 
                entity.getIDDanhMuc(), 
                entity.getMota());
    }

    @Override
    public void update(SanPham entity) {
        String sql = "UPDATE SanPham SET TenSanPham=?, IDNCC=?, IDDanhMuc=?, MoTa=? WHERE IDSanPham=?";
        XJdbc.update(sql,
                entity.getTenSanPham(),
                entity.getIDNCC(),
                entity.getIDDanhMuc(),
                entity.getMota(),
                entity.getIDSanPham());
    }

    @Override
    public void delete(String IDSanPham) {
        String sql = "delete from SANPHAM where IDSanPham=?";
        XJdbc.update(sql, IDSanPham);
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM SANPHAM";
        return this.selectBySql(sql);
    }

    @Override
    public SanPham selectById(String IDSanPham) {
        String sql = "SELECT * FROM SANPHAM WHERE IDSanPham=?";
        List<SanPham> list = this.selectBySql(sql, IDSanPham);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    SanPham entity = new SanPham();
                    entity.setIDSanPham(rs.getString("IDSanPham"));
                    entity.setTenSanPham(rs.getString("TenSanPham"));
                    entity.setIDNCC(rs.getString("IDNCC"));
                    entity.setIDDanhMuc(rs.getInt("IDDanhMuc"));
                    entity.setMota(rs.getString("MoTa"));
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

    public List<SanPham> selectTimKiem(String TenSanPham) {
       String sql="SELECT * FROM SANPHAM WHERE TenSanPham LIKE ?";
        return this.selectBySql(sql, "%"+TenSanPham+"%");
    }
}
