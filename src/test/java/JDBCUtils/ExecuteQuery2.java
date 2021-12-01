package JDBCUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
import com.mysql.jdbc.Driver;

public class ExecuteQuery2 
{

	@Test
	public void executequery() throws SQLException
	{
		Connection con=null;
		try
		{
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","root");
			
			Statement stat=con.createStatement();
			
			int result=stat.executeUpdate("delete from customer where id=6;");
			
			if(result==1)
			{
				System.out.println("successfully deleted");
			}
			
			else
			{
				System.out.println("not deleted");
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
	
	
	
	
	
	
	
	
	
	

