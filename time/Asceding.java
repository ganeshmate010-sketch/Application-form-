import java.util.*;
public class Asceding 
{ // ji array aapun madhe thakle nhi ty element println honar
	public static void main(String x[])
	{   Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		 System.out.println(" array the declare the one element nahi thayakyach\nEnter the array");
		for(int i=0; i<a.length; i++)
		{
			  a[i]=sc.nextInt();
			
		}
		System.out.println("Array  display the not is display:");
		for(int i=1; i<a.length; i++)
		{
			
			int diff=a[i]-a[i-1];
			if(diff>1)
			{
				int count=a[i-1];
				while(count<a[i]-1)
				{
					System.out.printf("%d\t",++count);
					
				}
			}
		}
		
	}
}