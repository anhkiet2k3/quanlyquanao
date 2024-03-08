package Dao;

import Entity.KhachHang;
import Entity.Voucher;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoucherDAO extends DAO<Voucher, String> {

    @Override
    public void insert(Voucher entity) {
        String sql = "INSERT INTO VOUCHER(IDVoucher, TenVoucher, GiaTri, NgayBatDau, NgayKetThuc, SoLuong ) VALUES (?,?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getIDVoucher(),
                entity.getTenVoucher(),
                entity.getGiaTri(),
                entity.getNgayBatDau(),
                entity.getNgayKetThuc(),
                entity.getSoLuong());
    }

    @Override
    public void update(Voucher entity) {
        String sql = "UPDATE VOUCHER SET TenVoucher=?, GiaTri=?, NgayBatDau=?, NgayKetThuc=?, SoLuong=? WHERE IDVoucher=?";
        XJdbc.update(sql,
                entity.getTenVoucher(),
                entity.getGiaTri(),
                entity.getNgayBatDau(),
                entity.getNgayKetThuc(),
                entity.getGiaTri());
    }

    @Override
    public void delete(String IDVoucher) {
        String sql = "delete from Voucher where IDVoucher=?";
        XJdbc.update(sql, IDVoucher);
    }

    @Override
    public List<Voucher> selectAll() {
        String sql = "SELECT * FROM Voucher";
        return this.selectBySql(sql);
    }

    @Override
    public Voucher selectById(String IDVoucher) {
        String sql = "SELECT * FROM Voucher WHERE IDVoucher=?";
        List<Voucher> list = this.selectBySql(sql, IDVoucher);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Voucher> selectBySql(String sql, Object... args) {
        List<Voucher> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Voucher entity = new Voucher();
                    entity.setIDVoucher(rs.getString("IDVoucher"));
                    entity.setTenVoucher(rs.getString("TenVoucher"));
                    entity.setGiaTri(rs.getDouble("GiaTri"));
                    entity.setNgayBatDau(rs.getString("NgayBatDau"));
                    entity.setNgayKetThuc(rs.getString("NgayKetThuc"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
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

    public List<Voucher> selectTimKiem(String TenVoucher) {
        String sql = "SELECT * FROM Voucher WHERE TenVoucher LIKE ?";
        return this.selectBySql(sql, "%" + TenVoucher + "%");
    }

}
