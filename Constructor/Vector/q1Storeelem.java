/* Q1. Write a Java program to add integer elements to a Vector and display all elements.
Input :- 10 20 30 40			Output :- Vector elements: [10, 20, 30, 40]
 */
import java.util.*;
public class q1Storeelem
{
	public static void  main(String x[])
	{
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		
	}
}