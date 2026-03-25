/* Q8. Write a java program to insert an element at a specific position in Vector.
Input :- 1 2 4		Insert 3 at index 2
Output :- [1, 2, 3, 4]
 */
import java.util.*;
public class q8Insert
{
	public static void main(String x[])
	{
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(4);
		v.add(5);
		System.out.println("Before "+v);
		v.add(2,3);
		System.out.println("After"+v);
	}
}