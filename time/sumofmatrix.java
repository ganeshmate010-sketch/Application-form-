import java.util.*;
public class sumofmatrix
{
 public static void main(String x[])
 {
  int a[][]=new int[3][3];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Array:");
  for(int i=0; i<a.length; i++)
   {
     for(int j=0; j<a.length; j++)
	 {
	   a[i][j]=sc.nextInt();
	 }
    }  
	System.out.println("Display Matrix");
	for(int i=0; i<a.length; i++)
	{  int sum=0;
		for(int j=0; j<a.length; j++)
		{
			System.out.printf("%d",a[i][j]);
			sum=sum+a[i][j];
			
		}
		System.out.println("--->"+sum);
	}
 }
 
}