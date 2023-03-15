
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class showTable {
    public static void main(String[] args) {
        System.out.println("Table Creation Example!");
        Connection con = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root","");
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery("Show tables");
      while(rs.next()) {
         System.out.print(rs.getString(1));
         System.out.println();
      }
      con.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }
    } 
}
