/* 4. Sort ArrayList in Ascending Order
Problem Statement:
Write a Java program to store integers in an ArrayList and sort them in ascending order.
Input: ArrayList = [50, 10, 40, 20]

Output: Sorted List = [10, 20, 40, 50]
Explanation:
Use Collections.sort(). */
import java.util.*;
public class q4Sorting 
{
 public static void main(String x[])
 {
    int a[]={50,10,40,50};
	List<Integer> li=new ArrayList<>();
	
	for(int i=0; i<a.length; i++)
	{
		li.add(a[i]);
	}
	Collections.sort(li);
	System.out.println(li);
		 

 }
}