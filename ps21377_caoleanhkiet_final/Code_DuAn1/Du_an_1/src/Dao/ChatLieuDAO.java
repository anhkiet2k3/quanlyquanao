/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.ChatLieu;
import Util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tri03
 */
public class ChatLieuDAO extends DAO<ChatLieu, String> {

    @Override
    public void insert(ChatLieu entity) {
        String sql = "INSERT INTO CHATLIEU (TenChatLieu) VALUES (?)";
        XJdbc.update(sql,
                entity.getTenChatLieu());
    }

    @Override
    public void update(ChatLieu entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChatLieu> selectAll() {
        String sql = "SELECT * FROM CHATLIEU";
        return this.selectBySql(sql);
    }

    @Override
    public ChatLieu selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<ChatLieu> selectBySql(String sql, Object... args) {
        List<ChatLieu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ChatLieu entity = new ChatLieu();
                    entity.setIDChatLieu(rs.getInt("IDChatLieu"));
                    entity.setTenChatLieu(rs.getString("TenChatLieu"));
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
    
    public void delete(int IDChatLieu) {
        String sql = "delete from CHATLIEU where IDChatLieu=?";
        XJdbc.update(sql, IDChatLieu);
    }

    public ChatLieu selectById(int IDChatLieu) {
        String sql = "SELECT * FROM CHATLIEU WHERE IDChatLieu=?";
        List<ChatLieu> list = this.selectBySql(sql, IDChatLieu);
        return list.size() > 0 ? list.get(0) : null;
    }

}
