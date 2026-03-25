/* Q1.Write a Java program to count the number of vowels, consonants, digits, and special characters present in a given string.
Explanation / Logic:
Traverse the string character by character using a loop
Check:
If character is a vowel (a, e, i, o, u)
Else if it is an alphabet → consonan
Else if it is a digit (0–9)
Otherwise → special character
Maintain separate counters for each */

import java.util.*;
public class TraversalString
{
	public static void main(String x[])
	{
		String s="a,e,i,o,u";
		int vowel=0;
		int consonants=0;
		int digit=0; 
		int SpecialChart=0;
		//travel the 
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'|| 
			ch=='A'||ch=='E'||ch=='I'|| ch=='O'|| ch=='U')	
			{ 
			vowel++;
			}
		   else if((ch>='a'&&ch<='z')||(ch>='A' && ch<='Z'))
			{
				consonants++;
			}
			else if(ch>=0 && ch<=9)
			{
				digit++;
			}
			else
			{
				SpecialChart++;
			}
			
			
		}
		  System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + SpecialChart);
	  
	
		
	}
}
