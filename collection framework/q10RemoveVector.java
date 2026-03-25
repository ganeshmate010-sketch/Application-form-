/* 10. Remove Element from Vector
Problem Statement:
Write a program to remove a given element from Vector.
Input:
Vector = [10,20,30,40]
Remove = 30
Output:
Updated Vector = [10,20,40]
Explanation:
Use vector.remove(Integer.valueOf(30)). */

import java.util.*;
public class q10RemoveVector
{
 public static void main(String x[])
 {  
      Vector<Integer> v=new Vector<>();
	  v.add(10);
	  v.add(20);
	  v.add(30);
	  v.add(40);
	    v.remove(Integer.valueOf(30));

	   System.out.println(v);
    
  }
}
/* D:\JAVA program\collection framework>java q10RemoveVector.java
[10, 20, 40] */