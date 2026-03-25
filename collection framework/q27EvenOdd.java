/* 2. Group Even and Odd Numbers using Map
Problem Statement:
Given an integer array, group even and odd numbers into a Map<String, List<Integer>>.
Input:
Array = 1 2 3 4 5 6
Output:
Even = [2,4,6]
Odd = [1,3,5]
Explanation:
Create Map with keys "Even" and "Odd" and store numbers accordingly.
 */
 
import java.util.*;
public class q27EvenOdd
{
 public static void main(String x[])
 {
	 int[] a={1,2,3,4,5,6};
	 
	 HashMap<String,List<Integer>> m=new HashMap<>();
	         
	 List<Integer> l=new ArrayList<>();
	 List<Integer> l1=new ArrayList<>();
	 for(int i=0; i<a.length; i++)
	 {
		 if(a[i]%2==0)
		 {
			 l.add(a[i]); 
		 }
		 else
		 {
			 l1.add(a[i]);
		 }
	 }
	 m.put("Even",l);
	 m.put("Odd",l1);
	 
	for (Map.Entry<String, List<Integer>> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
	 }
 }
}



       
     