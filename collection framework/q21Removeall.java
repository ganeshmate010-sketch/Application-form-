/* 21. Remove All Elements from ArrayList
Problem Statement:
Clear all elements from ArrayList.
Input:
[1,2,3,4]
Output:
[]
Explanation:
Use clear() method. */

import java.util.*;
public class q21Removeall
{
 public static void main(String x[])
 {
   ArrayList<Integer> a=new ArrayList<>();
    a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	
	 a.clear();
	System.out.println(a);
	
	
 }
}