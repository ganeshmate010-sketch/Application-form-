/* 1. Sort HashMap by Values (Descending)
Problem Statement:
Write a Java program to sort a HashMap<String, Integer> by values in descending order.
Input:
A = 50
B = 80
C = 30
D = 90
Output:
D = 90
B = 80
A = 50
C = 30
Explanation:
Convert entrySet() into List, use custom Comparator to sort by values. */


import java.util.*;
public class q26DescendingOrder
{
 public static void main(String x[])
 {
    HashMap<String,Integer> m=new HashMap<>();
	m.put("A",50);
	m.put("B",80);
	m.put("C",30);
	m.put("D",90);
	List<Map.Entry<String,Integer>> list=new ArrayList<>(m.entrySet());
	
	  Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
	  {
		 public  int compare(Map.Entry<String,Integer> o1,
		 Map.Entry<String,Integer>o2)
		 {
			 return o2.getValue().compareTo(o1.getValue());
		 }		 
	  });
	  for(Map.Entry<String,Integer> entry:list)
	  {
		  System.out.println(entry.getKey()+ " = " + entry.getValue());
	  }
		  
	  
	  
 }
}
