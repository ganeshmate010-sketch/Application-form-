/* 23. Find Intersection of Two Sets
Problem Statement:
Find intersection of two sets.
Input:
Set1 = [1,2,3]
Set2 = [2,3,4]
Output:
Intersection = [2,3]
Explanation:
Use retainAll(). */

import java.util.*;
public class q23intersection
{
  public static void  main(String x[])
  {
     HashSet<Integer> hs=new HashSet<>();
	 hs.add(1);
	 hs.add(2);
	 hs.add(3);
	
	HashSet<Integer> h1=new HashSet<>();
	 h1.add(2);
	 h1.add(3);
	 h1.add(4);
	 
	  hs.retainAll(h1);//two hashset convert 
	  System.out.println(hs);
	 
  }
}
