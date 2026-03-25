/* Q3.Write a Java program to find the most frequently occurring character in a string.
Explanation / Logic:
Convert string to character array
Use nested loops to count occurrences of each character
Track maximum count and corresponding character
Ignore already counted characters */

import java.util.*;
public class  CountString
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");
   String s=sc.nextLine();
     char ch[]=s.toCharArray();
	 
	 
   for(int i=0; i<ch.length; i++)
   {
	   int count=1; 
	     if(ch[i]!=0)
		 {
			 for(int j=i+1; j<ch.length; j++ )
			 {
				 if(ch[i]==ch[j])
				 {
					 count++;
					 ch[j]=0;
					 
				 }
			 }
			 System.out.println("--------->"+count);
		 }
 }
}
}