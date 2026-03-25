import java.util.*;
class Employeee
{
	private int id;
	private String name;
	
	public Employeee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
}
public class Employeeees
{
	public static void main(String x[])
	{ 
	  Scanner sc=new Scanner(System.in);
		ArrayList<Employeee> a=new ArrayList<>();
		
		System.out.println("Enter the Employee number");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter thee id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			Employeee e=new Employeee(id, name);
			a.add(e); 	
			
		}
		for(Employeee e:a)
		{
		 System.out.println(e.getId()+"\t"+e.getName());
		}
	}
}