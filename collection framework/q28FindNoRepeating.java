/* 3. Fmind First Non-Repeating Element using LinkedHashMap
Problem Statement:
Find first non-repeating element in an array using LinkedHashMap.
Input:
Array = 4 5 1 2 1 2 4
Output:
First Non-Repeating = 5
Explanation:
Store frequency in LinkedHashMap to maintain insertion order. */

import java.util.*;
public class q28FindNoRepeating
{
 public static void main(String x[])
 {
    int a[]={ 4,5,1,2,1,2,4};
	
	HashMap<Integer,Integer> m=new LinkedHashMap<>();
	
  for(int i=0; i<a.length; i++)
  {
	 if(m.containsKey(a[i])){
		map.put(a[i], map.get(a[i]) + 1);
	 }
	 else
	 {
		 m.put(a[i], 1);
	 }
	  
  }
  for(Map.Entry<Integer,Integer> entry : m.entrySet())
  {
	  if(entry.getValue()==1)
	  {
		  System.out.println("First Non-repeating = "+entry.getKey());
	  }
  }
  }
}



  


