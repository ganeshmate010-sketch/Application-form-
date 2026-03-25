/* 22. Find Union of Two Sets
Problem Statement:
Find union of two HashSet.
Input:
Set1 = [1,2,3]
Set2 = [3,4,5]
Output:
Union = [1,2,3,4,5]
Explanation:
Use addAll().
 */
import java.util.*;
public class q22FindUnion
{
 public static void main(String x[])
 {
     HashSet<Integer> hs=new HashSet<>();
	 hs.add(1);
	 hs.add(2);
	 hs.add(3);
	 
	 HashSet<Integer> hs1=new HashSet<>();
	 hs1.add(3);
	 hs1.add(4);
	 hs1.add(5);
	 hs.addAll(hs1);
	 System.out.println("union-->"+hs);
 }
}