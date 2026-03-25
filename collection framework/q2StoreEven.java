/* 2. Store Even Numbers in ArrayList
Problem Statement:
Write a Java program that stores only even numbers from an array into an ArrayList.
Input:
Array = 11 22 33 44 55 66
Output:
Even Numbers List = [22, 44, 66]
Explanation:
Traverse array → check arr[i] % 2 == 0 → add into ArrayList.
 */
 import java.util.*;
public class q2StoreEven
{
 public static void main(String x[])
 {
    int a[]={11,22,33,44,55,66};
	
	Vector<Integer> v=new Vector<>();
	for(int i=0; i<a.length; i++)
	{
		if(a[i]%2==0)
		{
			v.add(a[i]);
		}
	}
	for(int num: v)
	{
		System.out.println(num);
	}
  }
}