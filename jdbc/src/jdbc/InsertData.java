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
public class InsertData {
     public static void main(String[] args) {
        Connection con = null;
        int n=100;
        String name="hanu";
        String tb ="employee11";
  try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root","");
        Statement st = con.createStatement();
      int val = st.executeUpdate("INSERT "+tb+" VALUES("+n+","+'"'+name+'"'+")");
  
      System.out.println(val);
  }
  catch (Exception e){
  e.printStackTrace();
  }
  }
}
