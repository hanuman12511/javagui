/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Showdatabase {
    public static void main(String[] args) {
        System.out.println("Table Creation Example!");
        Connection con = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root","");
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery("select *from employee11");
      System.out.println("List of databases: ");
      while(rs.next()) {
         System.out.print(rs.getString(1));
          System.out.print(rs.getString(2));
         System.out.println();
      }
      con.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }
    } 
}
