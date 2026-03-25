class Employee
{
	private int id;
	private String name;
	
	public void setId(int id)//enter the id
	{this.id=id;
		
	}
	public int getId()//get fetch data input
	{
		return id;
	}
	public void  setNeme(String name)//Enter the data
	{
		this.name=name;
	}
	public String getName()//feach data
	{
		return name;
	}
	
	
	
}
public class pojoclass
{
	public static void main(String x[])
	{
		Employee e=new Employee();//create object of class
		e.setId(1);//id 
		e.setNeme("Ganesh");
		String name=e.getName();
		int id=e.getId();
		System.out.println("Name is "+name+"\nid is "+id);
	}
}