/* Q2. Given a sentence, reverse each word individually without changing the word positions.
Input :-  Java is very easy
Output :- avaJ si yrev ysae
Explanation / Logic:
Split the string into words using space
Reverse each word using loop
Join them back with space */

import java.util.*;
public class revString
{
	public static void main(String x[])
	{  Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
		String s=sc.nextLine();
		
		String  rev="";
	int len=s.length(); 
	for(int i=len-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
		System.out.printf(rev);
	

	
 }
}