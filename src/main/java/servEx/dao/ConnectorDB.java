package servEx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ConnectorDB {

    static final String URL = "jdbc:mysql://localhost:3306/CosyHome";
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

     static Statement getStat() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn.createStatement();
    }
     static PreparedStatement getPrepStat(String sql) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn.prepareStatement(sql);
    }
}
