/* Q4. Write a java program to remove a specific element from Vector.
Input :- 10 20 30	Remove index: 1	Output :- Vector after removal: [10, 30] */

import java.util.*;
public class q4Removeele
{
	public static void main(String x[])
	{ Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		 /* for(int i=0; i<v.size(); i++)
		 {
			int index=1;
			 System.out.println(v.get(i));
			  v.remove(index);
		 } */
		 System.out.println("Enter the index remove");
		 int index=sc.nextInt();;
		
		 if(index==index)
		 {
			 v.remove(index);
			 System.out.println("Element"+v);
			
		 }

		
	}
}