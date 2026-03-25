//WAP to create two functions one is used for sort integer array and one is used for sort character array


import java.util.*;
public class Sort
{
	public static void main(String x[])
	{
		int arr[]=new int[]{15,1,3,5,7,9};
		char ch[]=new char[]{'b','a','c','d'};
		sort(arr);
		sort(ch);
	
	}
	public static void sort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
				for(int j=(i+1); j<arr.length; j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
					
					
				}
		}
		System.out.println("Display the After Sorting ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("%d\t"+arr[i]);
		}
	}
	public static void sort(char ch[])
	{
		for(int i=0; i<ch.length; i++)
		{
			
			for(int j=(i+1); j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				
			}
		}
		System.out.println("Disply the After sorting charater");
		for(int i=0; i<ch.length; i++)
		{
			System.out.println("%c\t"+ch[i]);
		}
	}
}