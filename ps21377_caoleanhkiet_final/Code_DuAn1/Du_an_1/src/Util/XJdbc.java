package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class XJdbc {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost;database=Pro1041_QuanLyCuaHang";
    private static String username = "sa";
    private static String password = "";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection con = DriverManager.getConnection(dburl, username, password);
        PreparedStatement pre = null;
        if (sql.trim().startsWith("{")) {
            pre = con.prepareCall(sql);
        } else {
            pre = con.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pre.setObject(i + 1, args[i]);
        }
        return pre;
    }

    public static void update(String sql, Object... args) {
        try {
            PreparedStatement pre = XJdbc.getStmt(sql, args);
            try {
                pre.executeUpdate();
            } finally {
                pre.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... args) {
        try {
            PreparedStatement pre = XJdbc.getStmt(sql, args);
            return pre.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public static Object value(String sql, Object... args) {
        try {
            ResultSet res = XJdbc.query(sql, args);
            if (res.next()) {
                return res.getObject(0);
            }
            res.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
