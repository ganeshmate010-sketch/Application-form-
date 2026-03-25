/* 6. Remove All Null Values from ArrayList
Problem Statement:
Write a Java program to remove all null elements from an ArrayList.
Input:
[10, null, 20, null, 30]
Output:
[10, 20, 30]
Explanation:
Use removeAll(Collections.singleton(null)).
 */
 import java.util.*;
public class q6removeall
{
 public static void main(String x[])
 {
	int a[]={10,'null',20,'null',30};
	
	Array<Integer> a=new ArrayList<>();
	
	for(int i=0; i<a.length; i++)
	{
		a.add(a[i]);
	}
	removeAll(Collections.singleton(null));
	for(int num:a)
	{
     System.out.println(num);
	}
	
 }
}