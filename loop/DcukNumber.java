import java.util.*;
public class DcukNumber
{
 public static void main(String x[])
 {
	 Scanner sc=new Scanner(System.in);
	 int no,rem;
	 System.out.println("Enter the number:");
	 no=sc.nextInt();
	 while(no!=0)
	 {
		 rem=no%10;
		 no=no/10;
		 if(rem==0)
		 {
			 System.out.println("Number is duck");
		 }
		 else
		 {
			 System.out.println("Number is not duck");
		 }
	 
	 }
 }
}