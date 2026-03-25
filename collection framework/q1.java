/* Write a Java program that accepts an integer array of size N and removes duplicate elements using HashSet. Display the unique elements.
Input:
N = 8
Array = 10 20 30 20 40 10 50 30
Output:
Unique Elements = 10 20 30 40 50
Explanation:
Use HashSet to automatically remove duplicates and print elements. */
//19.2.2026
import java.util.*;

public class q1
{
  public static void main(String x[])
  {
	  Scanner sc=new Scanner(System.in);
	   int a[]={10, 20, 30, 20, 40, 10, 50, 30};
	   
	 HashSet<Integer> hs=new LinkedHashSet<>();
	 //remove Element
	 for(int i=0; i<a.length; i++)
	 {
		 hs.add(a[i]);
	 }
	 
	 
	 for(int num:hs)
	 {
		 System.out.println(num);
	 }
  }
}