/* Q2. Create an Employee POJO class with empId, name, and salary.
Store employees in a Vector.
Perform:
Increase salary by 10% if salary < 50,000
Search employee by ID
Display employees earning more than 60,000
Input :-
101 Rohit 45000
102 Priya 65000
103 Aman 48000
Output :-
		Updated Salary for Rohit: 49500
Employees earning above 60000:
Priya
Explanation
Traverse Vector
Apply salary increment condition
Search using empId
Filter employees using salary condition
 */
import java.util.*;
class Employee
{
	private int id;
	private String name;
	private double salary;
	
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
		
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
	this.salary=salary;
	}
	
}
public class q2Employeslary
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Vector<Employee> v=new Vector<>();
		
		v.add(new Employee(101,"Rohit",4500));
		v.add(new Employee(102,"Priya",65000));
	     v.add(new Employee(103,"Aman",48000));
		 
		 System.out.println("All display employee");
		 
		 for(Employee e:v)
		 {
			 System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
			 
		}
			for(Employee e:v)
			{
			if(e.getSalary()<50000)
			{
				double updatedSalary=e.getSalary()*1.10;
				e.setSalary(updatedSalary);
				if(e.getName().equals("Rohit"))
				{
					System.out.println("Updated salary for Rohit:"+updatedSalary);
					
				}
				
			   }
			}
			//	public double getSalary()

			System.out.println("Enter the id");
			int searchId=sc.nextInt();
			for(Employee e:v)
			{
				if(e.getId()==searchId)
				{
						System.out.println("Employee found::"+e.getName()+"\t"+e.getSalary()+"\t"+e.getId());
				}
			}
			//	public double getSalary()
			System.out.println("Employee earning above 60000:");
			for(Employee e:v)
			{
				if(e.getSalary()>60000)
				{
					System.out.println(e.getName()+"\t"+e.getSalary()+"\t"+e.getId());
				}
			}
			
		
		
	}
}


