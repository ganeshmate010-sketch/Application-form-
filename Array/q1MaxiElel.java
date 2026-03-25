/* 1. Find Maximum Element in an Array
Concept: Traverse the array and keep track of the maximum value found so far.
Example: arr = [12, 45, 2, 67, 33, 89, 21]
Output: 89 */

import java.util.*;
public class q1MaxiElel
{
	public static void main(String x[])
	{ Scanner sc=new Scanner(System.in);
		int a[]={12, 45, 2, 67, 33, 89, 21};
		int max=a[0];
	  for(int i=0; i<a.length; i++)
	{		
		if(a[i]>max)
		{
			max=a[i];
		}
	}

	System.out.println("Max value is"+max);
	}
}