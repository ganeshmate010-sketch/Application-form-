/* 
9. Merge Two Arrays
Concept: Append elements of the second array to the first or create a new array to store all.
Use Case: Combine product lists, user logs, etc.

Input Array 
___________________________________________________________
array1 = [1, 3, 5]
array2 = [2, 4, 6, 8]
Merged Array: [1, 3, 5, 2, 4, 6, 8]
 */
public class q9Mearge
{
	public static void main(String x[])
	{
		int a[]={1, 3, 5};
		int b[]={2, 4, 6, 8};
		int c[]=new int[a.length+b.length];
		
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
			
			
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.println("array\t"+c[i]);
		}
	}
}