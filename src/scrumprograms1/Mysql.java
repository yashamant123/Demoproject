package scrumprograms1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated  method stub
		Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Yash@1997";
     //   System.out.println(password.length());
       
        Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection(url, username, password);
		  stmt=con.createStatement();
		 String query = "SELECT * FROM persons";
		 rs=stmt.executeQuery(query);
		 //ResultSetMetaData rsmd = rs.getMetaData();
		 while (rs.next()) {
             // Assuming your table has columns named "column1", "column2", etc.
             String column1Value = rs.getString("PersonID");
             String column2Value = rs.getString("FirstName");

             // Do something with the retrieved data
             System.out.println("Column 1: " + column1Value + ", Column 2: " + column2Value);
         }
        
 
	}

}
