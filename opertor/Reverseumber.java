import java.util.*;
public class Reverseumber
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:-->");
   int no=sc.nextInt();
   no=(no%10)*100 +((no/10)%10)*10+no/100;
   System.out.println(no);
   
   
 }
 
}