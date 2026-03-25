
/* 2. Find Minimum Element in an Array
Concept: Similar to maximum, but track the smallest element.

 Example: arr = [12, 45, 2, 67, 33, 89, 21]
 Output: 2 */
 import java.util.*;
 public class q2Mini
 {
	 
	 public static void main(String x[])
	 {
		 int arr[]={12, 45, 2, 67, 33, 89, 21};
		 
		 int min=arr[0];
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i]<min)
			 {
				 min=arr[i];

			 }
		 }
		 System.out.println(min);
	 }
 }
