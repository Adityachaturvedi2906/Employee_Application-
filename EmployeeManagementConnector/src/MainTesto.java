import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTesto {

	public static void main(String[] args) throws Exception {

		System.out.println("***************Welcome to the Employee Management System***************");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Please Press 1 to Add into the Fields...");
			System.out.println("Please Press 2 to Delete Fields...");
			System.out.println("Please Press 3 to Display all the Fields...");
			System.out.println("Please Press 4 to Update the Fields...");
			System.out.println("Please Press 5 to Exit...");
		
		
		int toCheck = Integer.parseInt(br.readLine());
		
		if( toCheck == 1 )
		{
			System.out.println("Enter User ID: ");
			Integer id  = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the User Name: ");
			String name = br.readLine();
			
			System.out.println("Enter the Salary of the User: ");
			float salary = Float.parseFloat(br.readLine());
			
			Employee emp = new Employee(id, name, salary);
			
			boolean answer = employeeDao.InsertemptoDB(emp);
			
			if(answer)
			{
				System.out.println("Insertion Completed...");
			}else
			{
				System.out.println("Something went wrong");
			}
			System.out.println(emp);
		}
		
		else if(toCheck == 2)
		{
			System.out.println("Enter the User's Id to delete a field: ");
			
			int id  = Integer.parseInt(br.readLine());
			
			boolean answer = employeeDao.DeleteEmptoDB(id);
			
			if(answer)
			{
				System.out.println("Deleted Successfully");
			}else
			{
				System.out.println("Something went wrong");
			}
		}
		
		else if(toCheck == 3)
		{
		
			employeeDao.DisplayEmptoDB();
			
		}
		else if(toCheck == 4)
		{
	
			System.out.println("Please enter the Updated Users Id you want : ");
			int Uid = Integer.parseInt(br.readLine());
			
			System.out.println("Please enter the Updated Users Name you want : ");
			String Uname = br.readLine();
			
			System.out.println("Please enter the Updated Users Salary you want : ");
			float Usalary = Float.parseFloat(br.readLine());
			
			System.out.println("Please enter the existing Id where you want change the fields: ");
			int id  = Integer.parseInt(br.readLine());
			
			boolean answer = employeeDao.UpdateEmptoDB(Uid, Uname , Usalary, id);
			
			if(answer)
			{
				System.out.println("Updated Successfully...");
			}else
			{
				System.out.println("Something went wrong");
			}
			System.out.println("Updated Id: " + Uid);
			System.out.println("Updated Name: " + Uname);
			System.out.println("Updated salary " + Usalary);
			System.out.println("Id of which Feilds Updated: " + id);
		}
		
		else if(toCheck == 5){
			System.out.println("*********Thank you for Using the Application**********");
			System.exit(0);
		}
	 }
		
	}

}
