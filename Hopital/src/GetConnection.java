import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection c = null;
	private GetConnection()
	{
		
	}
	public static Connection getConnection(){
		if(c == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");  //My Sql Driver Name
				c=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/hospital?characterEncoding=utf-8","root","root");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return c;
		}else {
			return c;	
		}
	}

}
