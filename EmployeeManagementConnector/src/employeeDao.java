import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class employeeDao {

	public static boolean InsertemptoDB(Employee emp) throws Exception
	{
		
		boolean answer = false;
		
		Connection conn =  Connector.connect();
		String insert = "insert into emp(id, name, salary) values(?,?,?)";
		
		//prepared Statement
		
		PreparedStatement ppst = conn.prepareStatement(insert);
		
		ppst.setInt(1, emp.getId());
		ppst.setString(2, emp.getName());
		ppst.setFloat(3, emp.getSalary());
		
		ppst.executeUpdate();
		
		answer = true;
		
		return answer;
		
	}
	
	public static boolean DeleteEmptoDB(int id) throws Exception
	{
		boolean answer = false;
		
		Connection conn =  Connector.connect();
		String delete = "delete from emp where id  = ?";
		
		//prepared Statement
		
		PreparedStatement ppst = conn.prepareStatement(delete);
		ppst.setInt(1, id);
		
		ppst.executeUpdate();
		answer = true;
		
		
		answer = true;
		
		return answer;
	}
	
	public static void DisplayEmptoDB() throws Exception
	{
		boolean answer = false;
		
		Connection conn =  Connector.connect();
		String display = "select * from emp";
		Statement stmt = conn.createStatement();
		ResultSet set = stmt.executeQuery(display);
		//prepared Statement
		
		while(set.next())
		{
		   	int id = set.getInt(1);
			String name = set.getString(2);
			String salary = set.getString(3);
			
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Salary: " + salary);
			System.out.println("++++++++++++++++++++++++++++");
			
		}

	}
	
	public static boolean UpdateEmptoDB(int Uid, String Uname, float Usalary, int id) throws Exception
	{
		boolean answer = false;
		
		Connection conn =  Connector.connect();
		String Update = "update emp set id = ?, name = ?, salary = ? where id = ?";
		
		//prepared Statement
		
		PreparedStatement ppst = conn.prepareStatement(Update);

		ppst.setInt(1, Uid);
		ppst.setString(2, Uname);
		ppst.setFloat(3, Usalary);
		ppst.setInt(4, id);
		
		ppst.executeUpdate();
		
		answer = true;
		
		return answer;
	}
	
}
