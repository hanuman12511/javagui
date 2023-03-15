/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class createTable {
     public static void main(String[] args) {
        System.out.println("Table Creation Example!");
        Connection con = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root","");
        Statement st = con.createStatement();
        String table = "CREATE TABLE Employee11(Emp_code int, Emp_name char(10))";
        st.executeUpdate(table);
        System.out.println("Table creation process successfully!");
      con.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }
    }
}
