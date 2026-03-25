/* Q3. Write a java program to access and print each element of Vector using index.
Input :- 100 200 300		Output :- 100 200 300 */

import java.util.*;
public class q3Accesprintele
{
	public static void main(String x[])
	
	{
		Vector<Integer> v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		System.out.println("Access of element");
		for(int i=0; i<v.size(); i++)
		{
			System.out.print(v.get(i)+" ");
		}
	}
}