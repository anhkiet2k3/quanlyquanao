package Dao;

import Entity.KhachHang;
import Entity.NhaCungCap;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO extends DAO<KhachHang, String> {

    @Override
    public void insert(KhachHang entity) {
        String sql = "INSERT INTO KHACHHANG(IDKhachHang, TenKhachHang, GioiTinh, DiaChi, SDT ) VALUES (?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getIDKhachHang(),
                entity.getTenKhachHang(),
                entity.isGioiTinh(),
                entity.getDiaChi(),
                entity.getSDT());
    }

    @Override
    public void update(KhachHang entity) {
        String sql = "UPDATE KHACHHANG SET TenKhachHang=?, GioiTinh=?, DiaChi=?, SDT=? WHERE IDKhachHang=?";
        XJdbc.update(sql,
                entity.getTenKhachHang(),
                entity.isGioiTinh(),
                entity.getDiaChi(),
                entity.getSDT(),
                entity.getIDKhachHang());
    }

    @Override
    public void delete(String IDKhachHang) {
        String sql = "delete from KhachHang where IDKhachHang=?";
        XJdbc.update(sql, IDKhachHang);
    }

    @Override
    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM KhachHang";
        return this.selectBySql(sql);
    }

    @Override
    public KhachHang selectById(String IDKhachHang) {
        String sql = "SELECT * FROM KhachHang WHERE IDKhachHang=?";
        List<KhachHang> list = this.selectBySql(sql, IDKhachHang);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhachHang entity = new KhachHang();
                    entity.setIDKhachHang(rs.getString("IDKhachHang"));
                    entity.setTenKhachHang(rs.getString("TenKhachHang"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setSDT(rs.getString("SDT"));
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

    public List<KhachHang> selectTimKiem(String TenKhachHang) {
        String sql = "SELECT * FROM KhachHang WHERE TenKhachHang LIKE ?";
        return this.selectBySql(sql, "%" + TenKhachHang + "%");
    }

}
