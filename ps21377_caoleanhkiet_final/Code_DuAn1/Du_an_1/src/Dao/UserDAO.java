package Dao;

import Entity.User;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends DAO<User, String> {

    @Override
    public void insert(User entity) {
        String sql = "INSERT INTO [USER](IDUser, Ten, SDT, GioiTinh, NgaySinh, Email, DiaChi, Luong, VaiTro, TrangThai) VALUES (?,?,?,?,?,?,?,?,?,?)";
        XJdbc.update(sql,
                entity.getIDUser(),
                entity.getTen(),
                entity.getSDT(),
                entity.isGioiTinh(),
                entity.getNgaySinh(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getLuong(),
                entity.isVaiTro(),
                entity.isTrangThai());
    }

    @Override
    public void update(User entity) {
        String sql = "UPDATE [USER] SET Ten=?, SDT=?, GioiTinh=?, NgaySinh=?, Email=?, DiaChi=?, Luong=?, VaiTro=?, TrangThai=? WHERE IDUser=?";
        XJdbc.update(sql,
                entity.getTen(),
                entity.getSDT(),
                entity.isGioiTinh(),
                entity.getNgaySinh(),
                entity.getEmail(),
                entity.getDiaChi(),
                entity.getLuong(),
                entity.isVaiTro(),
                entity.isTrangThai(),
                entity.getIDUser());
    }

    @Override
    public void delete(String IDUser) {
        String sql = "delete from [USER] where IDUser=?";
        XJdbc.update(sql, IDUser);
    }

    @Override
    public List<User> selectAll() {
        String sql = "SELECT * FROM [USER]";
        return this.selectBySql(sql);
    }
    
    public List<User> select() {
        String sql = "SELECT * FROM dbo.Account JOIN dbo.[User] ON [User].idUser = Account.idUser ORDER BY [User].idUser Desc";
        return selectBySql(sql);
    }

    @Override
    public User selectById(String IDUser) {
        String sql = "SELECT * FROM [USER] WHERE IDUser=?";
        List<User> list = this.selectBySql(sql, IDUser);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<User> selectBySql(String sql, Object... args) {
        List<User> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    User entity = new User();
                    entity.setIDUser(rs.getString("IDUser"));
                    entity.setTen(rs.getString("Ten"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                    entity.setNgaySinh(rs.getString("NgaySinh"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setDiaChi(rs.getString("DiaChi"));
                    entity.setLuong(rs.getDouble("Luong"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
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

    public List<User> selectTimKiem(String Ten) {
        String sql = "SELECT * FROM [USER] WHERE Ten LIKE ?";
        return this.selectBySql(sql, "%" + Ten + "%");
    }

}
