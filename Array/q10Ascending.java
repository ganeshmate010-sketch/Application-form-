/* 10. Sort Array in Ascending Order
Concept: Implement a sorting algorithm like bubble sort, selection sort, or use built-in sort.
Use Case: Sort names, scores, ranks, etc.
Input: arr = [7, 2, 9, 4, 1]
Output:  [1,2,4,7,9] */

import java.util.*;
public class q10Ascending
{
	public static void main(String x[])
	{
		int a[]={7, 2, 9, 4, 1};
		Arrays.sort(a);
		for(int num:a)
		{
			System.out.println(num);
		}
	}
}