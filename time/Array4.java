
//Linear Search 
import java.util.*;
public class Array4 
{
   public static void main(String x[])
   {   Scanner sc=new Scanner(System.in);
    int a[]=new int[]{10,20,30,40,50};
	  int index=-1,sky;
	  System.out.println("Enter  Search  key");
	  sky=sc.nextInt();//50
	for(int i=0; i<a.length; i++)
	{
		if(a[i]==sky)
		{
			System.out.println("Value of\n"+a[i]+"\nIndex of\t"+i);
		}
		
	}
	
	if(index!=-1)
	{
		System.out.println("Value found");
	}
	
	else
	{
		System.out.println("Value not found");
	}
   }
}
/* output
D:\JAVA program\time>java Array4.java
Enter  Search  key
40
Value of
40
Index of  3
Value not found */