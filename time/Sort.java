import java.util.*;
public class Sort
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the five Value:");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();//1 3 2 4 5 
		}
		System.out.println("Display the array");
		for(int i=0; i<a.length; i++)
		{
			System.out.println("------>"+i);// 1 3 2 4 5 
			
		}
		System.out.println("\n");
		//Sorting login
		for(int i=0; i<a.length; i++)//outer //1  3
		{
			for(int  j=(i+1); j<a.length; j++)//inner
			{
				if(a[i]>a[j])
				{  //1>3 3>2
					int temp=a[i];//3 
					a[i]=a[j];//3==2
					a[j]=temp;//1 2 3 4 5
				}
			}
		}
		System.out.println("Display the sorting");
		for(int i=0; i<a.length; i++)
		{
			System.out.println("%d\t"+a[i]);
		}
	}
}
