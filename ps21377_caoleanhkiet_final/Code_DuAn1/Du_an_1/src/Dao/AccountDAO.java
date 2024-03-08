package Dao;

import Entity.Account;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO extends DAO<Account, String> {

    @Override
    public void insert(Account entity) {
        String sql = "INSERT INTO Account (IDUser, UserName, PassWord) VALUES (?, ?, ?)";
        XJdbc.update(sql, entity.getIDUser(), entity.getUserName(), entity.getPassWord());
    }

    @Override
    public void update(Account entity) {
        String sql = "UPDATE Account SET UserName=?, PassWord=? WHERE IDUser=?";
        XJdbc.update(sql, entity.getUserName(), entity.getPassWord(), entity.getIDUser());
    }
    
    public void forget(Account entity) {
        String sql = "UPDATE Account SET PassWord=? WHERE UserName=?";
        XJdbc.update(sql, entity.getPassWord(), entity.getUserName());
    }

    @Override
    public void delete(String IDUser) {
        String sql = "DELETE FROM Account WHERE IDUser=?";
        XJdbc.update(sql, IDUser);
    }

    @Override
    public List<Account> selectAll() {
        String sql = "SELECT * FROM Account";
        return this.selectBySql(sql);
    }

    @Override
    public Account selectById(String IDUser) {
        String sql = "SELECT * FROM Account WHERE IDUser=?";
        List<Account> list = this.selectBySql(sql, IDUser);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public Account selectByUserName(String UserName) {
        String sql = "SELECT * FROM Account WHERE UserName=?";
        List<Account> list = this.selectBySql(sql, UserName);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Account> selectBySql(String sql, Object... args) {
        List<Account> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    Account entity = new Account();
                    entity.setIDUser(rs.getString("IDUser"));
                    entity.setUserName(rs.getString("UserName"));
                    entity.setPassWord(rs.getString("PassWord"));
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
