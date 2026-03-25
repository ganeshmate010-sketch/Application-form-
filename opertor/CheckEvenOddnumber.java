import java.util.*;
public class CheckEvenOddnumber
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:-->");
   int no=sc.nextInt();
   if(no%2==0)
   {
	   System.out.println("Even number:-->"+no);
   }
   else
   {
	   System.out.println("Odd Number:--->"+no);
	   
   }
   
 }
}