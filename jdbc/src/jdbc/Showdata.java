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
public class Showdata {
    public static void main(String[] args) {
        
        Connection con = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select *from employee11");
  while (rs.next()){
 
  System.out.println(rs.getInt("Emp_code"));
  }
  }catch(Exception e){
          System.out.println(""+e);
          }
  } 
}
