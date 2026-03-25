/* 7. Reverse an Array
Concept: Swap elements from both ends moving toward the center.
Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
 */
import java.util.*;
public class q7Swaparray
{
	public static void main(String x[])
	{
	int a[]={10, 20, 30, 40, 50};
	
	int start=0;
	int end=a.length-1;
	while(start<end)
	{
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		start++;
		end--;
		
	}
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]+" ");
	}
	}
}
