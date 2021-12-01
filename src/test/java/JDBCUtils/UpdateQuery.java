package JDBCUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class UpdateQuery 
{
   @Test
   
   public void updateQuery() throws SQLException
   {
	  Connection con=null;
	  try {
		  
		  Driver driver= new Driver();
		  DriverManager.registerDriver(driver);
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
		  
		  Statement st= con.createStatement();
		  int result=st.executeUpdate("update customer set last_name='Mukesh',address='TPT' where id=5");
		  if(result==1)
		  {
			  System.out.println("successfully updated");
		  }
		  
		  
	  }
	   catch(Exception e)
	  {
		   
	  }
	   finally
	   {
		   con.close();
	   }
	   
	   
   }
	
	
	
	
	
}
