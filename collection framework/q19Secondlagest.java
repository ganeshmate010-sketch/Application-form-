/* 19. Find Second Largest Element using ArrayList
Problem Statement:
Find second largest number from an ArrayList.
Input:
[10, 50, 20, 80, 40]
Output:
Second Largest = 50
Explanation:
Sort list → access size()-2.
 */
 
 
import java.util.*;
public  class q19Secondlagest
{
 public static void main(String x[])
 {
    ArrayList<Integer> a=new ArrayList<>();
	a.add(10);
	a.add(50);
	a.add(20);
	a.add(80);
	a.add(40);
	Collections.sort(a);
	
	 int second=a.get(a.size()-2);
	 
	 System.out.println("Second Lagest--->"+second);
	
 }
}