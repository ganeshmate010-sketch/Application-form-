/* 8. Find Common Elements between Two Arrays using Set
Problem Statement:
Write a program to find common elements between two arrays using HashSet.
Input:
Array1 = 1 2 3 4 5
Array2 = 3 4 5 6 7
Output:
Common Elements = 3 4 5
Explanation:
Add first array to set → check second array elements.
 */
import java.util.*;
public class q8CommanElemet
{
  public static void main(String x[])
  {
       int a[]={1,2,3,4,5};
	   int b[]={3,4,5,6,7};
	   
	   HashSet<Integer> hs=new HashSet<>();
	   
	       // Add first array elements into HashSet

	   for(int i=0; i<a.length; i++)
	   {
		     hs.add(a[i]);//add elements
	   }
	   for(int j=0; j<b.length; j++)
	   {
		  
		   if(hs.contains(b[j]))//import line
		   {
			  System.out.println("Common Element-->"+b[j]);
     			  
		   }
		   
	   }
  }
}
//Set==[5, 10, 15, 20]
//Set==[5, 10, 15, 20]