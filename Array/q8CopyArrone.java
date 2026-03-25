/* 8. Copy One Array to Another
Concept: Iterate and assign elements from one array to a second array.
Use Case: Useful in backup or undo operations.
source = [5, 10, 15, 20, 25]
destination = [5, 10, 15, 20, 25] */

import java.util.*;
public class q8CopyArrone
{
	public static void main(String x[])
	{
		int a[]={5, 10, 15, 20, 25};
		int b[]=new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
			System.out.printf("\t"+a[i]);
		}
		for(int j=0; j<b.length; j++)
		{
			System.out.println("\n"+b[j]);
		}
	}

}