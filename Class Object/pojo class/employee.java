import java.util.*;
class Employe
{ private int id;
  private String name;
  private int sal;
  public void setid(int id)
  {
	  this.id=id;
  }
  public int getId()
  {
	  return id;
  }
  public void setName(String name)
  {
	  this.name=name;
	  }
	public String getName()
	{
		return name;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
}
public class employee
{
	public static void main(String x[])
	{
		
		 Employe emp[]=new Employe[5];
		 for(int i=0; i<emp.length; i++)
		 {
		   emp[i]=new Employe();
		   Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the id-->");
		 int id=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the  name-->");
		 String  name=sc.nextLine();
		 System.out.println("Enter Sal:-->");
		 int sal=sc.nextInt();
		 emp[i].setName(name);
		 emp[i].setId(id);
		 emp[i].setSal(sal);
	}
	        // Display data
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(
                emp[i].getId() + "  " +
                emp[i].getName() + "  " +
                emp[i].getSal()
            );

	}
}