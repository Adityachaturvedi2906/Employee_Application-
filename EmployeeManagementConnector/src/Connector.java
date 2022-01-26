import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {

	static Connection con;
	
		public static Connection connect() throws Exception
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");		//Driver registered
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management", "root", "742529");
			
			return con;
		}
	
}
