/* 25. Count Words Frequency in String using HashMap
Problem Statement:
Count frequency of words in a given string.
Input:
"java is easy java is powerful"
Output:
java = 2
is = 2
easy = 1
powerful = 1
Explanation:
Split string → store words in HashMap → count frequency. */

import java.util.*;
public class q25CountWorld
{
 public static void main(String x[])
 {
     String str="java is easy java is powerful";
	 String words[]=str.split(" ");
	 
	 HashMap<String, Integer> m=new HashMap<>();
	 for(String word:words)
	 {
		 if(m.containsKey(word))
		 {
			 m.put(word,m.get(word)+1); 
		 }
		 else
		 {
			 m.put(word,1);
		 }
		 
	 }
	 for(Map.Entry<String,Integer> entry: m.entrySet())
	 {
		 System.out.println(entry.getKey()+"="+entry.getValue());
		 
	 }
	
 }
}


        
      