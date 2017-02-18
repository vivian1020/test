package com.cnc.thread.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by liujinwen on 2017/2/13.
 */
public class MyObject {
    public enum MyEnumSingleton  {
        connectionFactory;
        private Connection connection;
        private MyEnumSingleton() {
            try {
                System.out.println("创建MyObject对象");
                String url = "jdbc:sqlserver://localhost:1079:database";
                String username = "sa";
                String password = "";
                String driveName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(driveName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        public Connection getConnection() {
            return connection;
        }

    }
    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
