/* 3. Sum of All Elements
Concept: Use a loop to add each element to a running total.
 Example: arr = [1,2,3,4,5]
 Output: 15 */

import java.util.*;
public class q3SumAll
{
 public static void main(String x[])	
 {
	 int a[]={1,2,3,4,5}; 	 
	 int sum=0;
	 for(int i=0; i<a.length; i++)
	 {
		 sum=sum+a[i];
		 System.out.println(a[i]+" ");
		
	 }
	  System.out.println("Element-->"+sum);
 }
}