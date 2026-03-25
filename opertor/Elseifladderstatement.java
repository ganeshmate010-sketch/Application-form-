import java.util.*;
public class Elseifladderstatement 
{
	public static void main(String x[])
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter three number A & b & c");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("A is grater:");
		 }
		 else if(b>a && b>c)
		 {
			 System.out.println("B is greater:");
		 }
		 else
		 {
			 System.out.println(" C is greter:");
		 }
	 
	}
}