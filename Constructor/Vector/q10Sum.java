/* Q10.Write a Java program to store integer elements in a Vector and calculate the sum of all elements.
Input :- 10 20 30 40
Output :- Sum of Vector elements: 100 */

import java.util.*;
public class q10Sum
{
	public static void main(String x[])
	{
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		int sum=0;
		for(int i=0; i<v.size(); i++)
		{
			sum+=v.get(i);
		}
		System.out.println("sum vector sum-->"+sum);
	}
}