package sample.c308;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBDemo {
    
    public static void main(String[] args) {
        // 1. Register type 4 DriverManager
        // 2. Get Connection object from DriverManager
        // 3. From Connection, get Statement
        // 4. From Statement, get ResultSet
        // 5. ResultSet contain exact data from table in the database

        Properties prop = null;
        FileInputStream input = null;
        Connection conn = null;

        try {
            input = new FileInputStream("C:\\study\\core-java\\src\\main\\java\\sample\\c308\\DBConfig.properties");
            prop = new Properties();
            prop.load(input);

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println(conn);

            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery("select * from employee");
            while (rs.next()) {
                int id = rs.getInt(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                System.out.println(id + " " + fname + " " + lname);
            }
        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {

        } catch (IOException e) {

        }
    }
}
