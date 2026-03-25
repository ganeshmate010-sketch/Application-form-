
/* 4. Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 
arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
 */
import java.util.*;
public class q4Average
{
	public static void main(String x[])
	{
		 int a[]={10, 20, 30, 40, 50};
		 int sum=0; 
		 float ave;
		 for(int i=0; i<a.length; i++)
		 {
			 sum+=a[i];
			 
		 }
		   
			  ave=(float)sum/a.length;
			System.out.println("averge-->"+ave);
		 System.out.println("Sum of ==>"+sum);
		  
	}
	
}