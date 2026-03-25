/* Q16. Given an ArrayList of integers, find the first element that occurs only once.
Explanation
For each element, count how many times it appears.
The first element with count 1 is the answer.
Input:- [4, 5, 1, 2, 0, 4]		Output :- 5 */

import java.util.*;
public class  firstelementfind16
{
	public static void  main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(4);
		a.add(5);
		a.add(1);
		a.add(2);
		a.add(0);
		a.add(4);
		
		
		for(int i=0; i<a.size(); i++)
		{ int count=0;
			for(int j=0; j<a.size(); j++)
			{
				if(a.get(i).equals(a.get(j)))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("first no-reapting element"+a.get(i));
				break;
			}
		}
		
	}
	
}
