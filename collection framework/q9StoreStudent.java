
/* Explanation:
Use HashMap<String, Integer>.
9. Store Student Names and Marks using HashMap
Problem Statement:
Store 5 student names and their marks in HashMap and display all records.
Input:
Amit = 80
Ravi = 70
Output:
Amit → 80
Ravi → 70

Explanation:
Use HashMap<String, Integer>. */

import java.util.*;
public class q9StoreStudent
{
  public static void main(String x[])
  {
     HashMap<String,Integer> m=new HashMap<>();
	 m.put("Amit",80);
	 m.put("Ganesh",70);
	 m.put("Harshd",30);
	 m.put("Gopal",50);
	 m.put("Viki",60);
	 for(Map.Entry<String, Integer> entry:m.entrySet()	)
	 {
		 System.out.println(entry.getKey()+"-->"+entry.getValue());
		 
	 }
	  
  }
}
/* Ganesh-->70
Amit-->80
Viki-->60
Harshd-->30
Gopal-->50 */