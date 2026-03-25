/* 16. Remove Duplicates from ArrayList using Set
Problem Statement:
Remove duplicate elements from ArrayList.
Input:
[10,20,10,30,20]
Output:
[10,20,30]
Explanation:
Convert list into LinkedHashSet to preserve order. */

import java.util.*;
public class q16DublicateRemov
{
 public static void main(String x[])
 {
   ArrayList<Integer> a=new  ArrayList<>();
   a.add(10);
   a.add(20);
   a.add(10);
   a.add(30);
   a.add(20);
      
	 LinkedHashSet<Integer> h=new LinkedHashSet<>(a);
	  ArrayList<Integer> ab=new ArrayList<>(h);
	  System.out.println(ab);
   
 }
}