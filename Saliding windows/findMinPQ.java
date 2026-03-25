import java.util.*;
public class findMinPQ
{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5};
		
		int sum=0; 
		int k=3;
		
		for(int i=0; i<k; i++)
		{
			sum=sum+a[i];//6
			
		}
		System.out.println("sum:"+sum);
		
		for(int i=k; i<a.length; i++)
		{     //
			sum=sum+a[i]-a[i-k];
		
		}
		System.out.println("sum:"+sum);
		
	}
}
