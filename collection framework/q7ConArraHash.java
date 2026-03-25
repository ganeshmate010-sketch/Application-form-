/* 7. Convert Array to HashSet
Problem Statement:
Convert a given integer array into a HashSet and display elements.
Input:
Array = 5 10 15 5 20
Output:
Set = [5, 10, 15, 20]
Explanation:
Add array elements into HashSet.
 */
import java.util.*;
public class q7ConArraHash
{
  public static void main(String x[])
  {
     int a[]={5, 10, 15, 20};
	 
	 HashSet<Integer> hs=new LinkedHashSet<>();
	 
	 
	 for(int i=0; i<a.length; i++)
	 {
		 hs.add(a[i]);
	 }
     System.out.println("Set=="+hs);
  }
}