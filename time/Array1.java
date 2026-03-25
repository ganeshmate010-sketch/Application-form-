import java.util.*;
public class Array1
{
 public static void main(String x[])
  {
   int a[]=new int[5];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Array");
   for(int i=0; i<a.length; i++)
   {
	   a[i]=sc.nextInt();
	    
   }
    System.out.println("Display the array:\n");
	for(int i=0; i<a.length; i++)
	{
		System.out.printf("%d\t",a[i]);
	}
   
 }
}
/* D:\JAVA program\time>java Array1.java
Enter the Array
10 20 30 40 50
Display the array:

10      20      30      40      50 */