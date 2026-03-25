/* Q2. Write a program to find the number of elements in a Vector.
Input :- 5  25  15                    Output :- Size of Vector: 3 */

import java.util.*;
public class q2FinsApp
{
	public static void  main(String x[])
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		
		System.out.println("Vector size "+v.size());
		
	}
}