/* Q9. Write a java program to copy elements from one Vector to another.
Input :- Vector1: 5 10 15
Output :- Vector2: [5, 10, 15] */

import java.util.*;
public class q9copyEle
{
	public static void main(String x[])
	{
		Vector<Integer> v=new Vector<>();
		
		v.add(5);
		v.add(10);
		v.add(15);
		System.out.println("vector1"+v);
		Vector<Integer> v1=new Vector<>();
		for(int i=0; i<v.size(); i++)
		{
			v1.add(v.get(i));
			
		}
		System.out.println("Vector2"+v1);
		
	}
}