/* 12. Check Element Exists in Set
Problem Statement:
Check whether a given number exists in HashSet.
Input:
Set = [10,20,30]
Check = 20
Output:
Element Found
Explanation:
Use set.contains().
 */
import java.util.*;
public class q12ChackElement
{
 public static void main(String x[])
 {
   ArrayList<Integer> h=new ArrayList<>();
   h.add(10);
   h.add(20);
   h.add(30);
   
   int check=20;
   if(h.contains(check))
   {
	   System.out.println("Element found\n"+h);
   }
   
   else
   {
	   System.out.println("Not found:");
   }
  
 }
}