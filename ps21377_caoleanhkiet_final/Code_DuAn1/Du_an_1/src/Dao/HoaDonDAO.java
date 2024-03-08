package Dao;

import Entity.HoaDon;
import Entity.KhachHang;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoaDonDAO extends DAO<HoaDon, String> {

    @Override
    public void insert(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void insert() {
        String sql = "INSERT INTO HOADON (IDUser, IDKhachHang, TongTien, IDVoucher, TrangThaiThanhToan ) VALUES (null,null,null,null,0)";
        XJdbc.update(sql);
    }

    @Override
    public void update(HoaDon entity) {
        String sql = "UPDATE HOADON SET IDUser=?, IDKhachHang=?, NgayTao=?, TongTien=?, IDVoucher=?, TrangThaiThanhToan=1 WHERE IDHoaDon=?";
        XJdbc.update(sql,
                entity.getIDUser(),
                entity.getIDKhachHang(),
                entity.getNgayTao(),
                entity.getTongTien(),
                entity.getIDVoucher(),
                entity.getIDHoaDon());
    }

    @Override
    public void delete(String IDHoaDon) {
        String sql = "delete from HoaDon where IDHoaDon=?";
        XJdbc.update(sql, IDHoaDon);
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon";
        return this.selectBySql(sql);
    }

    @Override
    public HoaDon selectById(String IDHoaDon) {
        String sql = "SELECT * FROM HoaDon WHERE IDHoaDon=?";
        List<HoaDon> list = this.selectBySql(sql, IDHoaDon);
        return list.size() > 0 ? list.get(0) : null;
    }

    public HoaDon selectByTT() {
        String sql = "SELECT * FROM HoaDon WHERE TrangThaiThanhToan=0";
        List<HoaDon> list = this.selectBySql(sql);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<HoaDon> selectByCTT() {
        String sql = "SELECT * FROM HoaDon WHERE TrangThaiThanhToan=0";
        return this.selectBySql(sql);
    }

    public HoaDon selectByCTT(String TrangThaiHoaDon) {
        String sql = "SELECT * FROM HoaDon WHERE TrangThaiThanhToan=0";
        List<HoaDon> list = this.selectBySql(sql, TrangThaiHoaDon);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setIDHoaDon(rs.getString("IDHoaDon"));
                    entity.setIDUser(rs.getString("IDUser"));
                    entity.setIDKhachHang(rs.getString("IDKhachHang"));
                    entity.setNgayTao(rs.getString("NgayTao"));
                    entity.setTongTien(rs.getDouble("TongTien"));
                    entity.setIDVoucher(rs.getString("IDVoucher"));
                    entity.setTrangThaiThanhToan(rs.getBoolean("TrangThaiThanhToan"));
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
