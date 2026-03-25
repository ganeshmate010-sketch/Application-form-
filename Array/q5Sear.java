/* 5. Search for an Element (Linear Search)
Concept: Traverse array linearly and compare each value with the target.
 
arr = [10, 20, 30, 40, 50]
Enter search key  : 30 
Output: value found 
Enter search key: 30
Output: value not found  */

import java.util.*;
public class q5Sear
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10, 20, 30, 40, 50};
		boolean found=false;
		System.out.println("Enter the search key");
		int search=sc.nextInt();
		for(int i=0; i<a.length; i++)
			{
				if(a[i]==search)
				{
					found=true;
				}
			}
	
	      if(found)
		  {
			  System.out.println("Values found");
		  }
		  else{
			  System.out.println("Not found");
		  }
	}
}