import java.util.*;
public class q2Array
{
 public static void main(String x[])
 {
  int a[];
  a=new int[4];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter values in array:");
  for(int i=0; i<a.length; i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("Display Array data");
  for(int i=0; i<a.length; i++)
  {
   System.out.printf("%d\t",a[i]);
  }
 }
}