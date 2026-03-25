
/* Q6. Write a java program to search a given element in Vector.
Input :- Elements: 5 10 15	Search: 10 
Output :- Element found */

import java.util.*;
public class q6Search
{
	public static void main(String x[])
	{ Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<>();
		v.add(5);
		v.add(10);
		v.add(15);
		System.out.println("Search Element");
		int search=sc.nextInt();
		boolean found=false;
		
		        for(int i=0; i<v.size(); i++)
				{    
					if(v.get(i)==search)
					{
						found=true;
						break;
					}
				} 
				if(found)
				{
					 System.out.println("Element found");
				}
				else
				{
					 System.out.println("Not element found");
				}
	}
}
