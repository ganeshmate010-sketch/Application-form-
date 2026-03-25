import java.util.*;
public class RemoveDigitDisplay
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
   int n=sc.nextInt();

   n=n/10;
   System.out.println("Remove the number:-->"+n);
   int rem=n%10;
   System.out.printf("Remove the display %d\n:",rem);
   
 }
}