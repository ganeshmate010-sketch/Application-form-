/* 5. Compare Two ArrayLists
Problem Statement:
Write a Java program to check whether two ArrayList<Integer> are equal or not.
Input:
List1 = [10,20,30]
List2 = [10,20,30]
Output:
Both lists are equal.
Explanation:
Use list1.equals(list2). */

import java.util.*;
public class q5Compare
{
 public static void main(String x[])
 {
  int  a[]={10,20,30};
  int b[]={10,20,30};
  List<Integer> li=new ArrayList<>();
  List<Integer> li1=new ArrayList<>();
  
  
    for(int i=0; i<a.length; i++)
	{   li.add(a[i]);

	}
		for(int j=0; j<b.length; j++)
		{
			 li1.add(b[j]);
			 
		}
		if(li.equals(li1))
		{
			System.out.println("Both lists are equal.");
		}
		else
		{
			System.out.println("Not Equals");
		}
	
 }
}