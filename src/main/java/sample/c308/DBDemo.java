package sample.c308;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
    
    public static void main(String[] args) {
        // 1. Register type 4 DriverManager
        // 2. Get Connection object from DriverManager
        // 3. From Connection, get Statement
        // 4. From Statement, get ResultSet
        // 5. ResultSet contain exact data from table in the database

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "oarnud9I");
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

        }
    }
}
