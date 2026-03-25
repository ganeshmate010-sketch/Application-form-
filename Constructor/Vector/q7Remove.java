/* Q7. Write a java program to remove all elements from Vector.
Input :- 10 20 30		Output:- Vector after clear: [ ] */

import java.util.*;
public class q7Remove
{
	public static void  main(String x[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(" Vector Before "+v);
		v.clear();
		System.out.println("Vector after clear"+v);
	}
}