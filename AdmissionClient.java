import java.util.*;

public class AdmissionClient
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		services ser=new StudentServiceImp();
		do{
			System.out.println("\n1:Register StudentL:");
			System.out.println("2:view all Student");
			
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the name:");
				String  name=sc.nextLine();
				System.out.println("Enter the coures:");
				String coures=sc.nextLine();
				System.out.println("Enter the age:");
				int age=sc.nextInt();
				Student s=ser.registerstudent(name,coures,age);
				System.out.println("Register completed! your Id id:"+s.getId());
				
				break;
				case 2:
				break;
				case 3:
				break;
				case 4:
				break;
				
			}
			
		}while(true);
	}
}