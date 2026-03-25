	/* 3. Count Frequency of Each Element using HashMap
Problem Statement:
Write a Java program to count frequency of each element in an integer array using HashMap.
Input:
Array = 1 2 3 2 4 1 5 2
Output:
1 = 2
2 = 3
3 = 1
4 = 1
5 = 1
Explanation:
Use map.put(key, map.getOrDefault(key,0)+1). */

import java.util.*;
public class q3CountFrea
{
   public static void main(String x[])
   {
	   int a[]={1,2,3,2,4,1,5,2};
	   HashMap<Integer,Integer> m=new HashMap<>();
	  
	   for(int num:a)
	   {
		  m.put(num, m.getOrDefault(num,0)+1);
	   }
	   
	    for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
		}
   }
   
}