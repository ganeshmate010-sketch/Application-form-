/* 15. Find Key with Highest Value in HashMap
Problem Statement:
Find the student with highest marks using HashMap.
Input:
A = 60
B = 90
C = 75
Output:
Topper = B
Explanation:
Iterate using entrySet() and compare values. */

import java.util.*;
public class q15Highest
{ 
  public static void main(String x[])
  {
    HashMap<String, Integer> h=new HashMap<>();
	h.put("A",60);
	h.put("B",80);
	h.put("C",75);
	
	String topper="";
	int marks=0;
	for(Map.Entry<String,Integer> entry: h.entrySet())
	{
		if(entry.getValue()>marks)
		{
			marks=entry.getValue();
			topper=entry.getKey();
		}
	}
	System.out.println("Toppe = "+topper);
	}
}


