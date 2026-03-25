/* 24. Store Employee IDs in TreeSet
Problem Statement:
Store employee IDs in TreeSet and display in sorted order.
Input:
IDs = 105, 101, 110, 103
Output:
Sorted IDs = [101,103,105,110]
Explanation:
TreeSet stores elements in sorted order automatically.
 */
 
import java.util.*;
public class q24threeSet
	
{
 public static void main(String x[])
 {
    TreeSet<Integer> t=new TreeSet<>();
	t.add(105);
	t.add(101);
	t.add(110);
	t.add(103);
	 System.out.println("Sorted Array--->"+t);
	
 }
 
}
/* output

D:\JAVA program\collection framework>java q24threeSet.java
Sorted Array--->[101, 103, 105, 110] */
