import java.util.*;
class Student
{
	private String name;
	private int id;
	private  int mark;
	
    Student (String name,int id,int mark)
	{
		this.name=name;
		this.id=id;
		this.mark =mark;
	   	
	}
     void show()
	 {
		 System.out.prinltn("Name-->");
		 System.out.println("Id---->");
		 System.out.println("Mark--->");
		 
	 }
}
public class Demoo
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the name:");
  String name=sc.nextLine();
  System.out.println("Enter the id:");
  int id=sc.nextInt();
  System.out.println("Enter the Mark:");
  int mark=sc.nextInt();
  Student t=new Student(name,id,mark)
  s.show();
  
  
 }
}