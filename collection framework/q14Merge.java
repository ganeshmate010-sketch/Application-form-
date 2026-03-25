/* 14. Merge Two ArrayLists
Problem Statement:
Merge two ArrayList<Integer> into one list.
Input:
List1 = [1,2]
List2 = [3,4]
Output:
Merged List = [1,2,3,4]
Explanation:
Use list1.addAll(list2).
 */
 
import java.util.*;
public class q14Merge
{
 public static void main(String x[])
 {
    ArrayList<Integer> a=new ArrayList<>();
	a.add(1);
	a.add(2);
	ArrayList a1=new ArrayList();
	a1.add(3);
	a1.add(4);
	
	a.addAll(a1);
	System.out.println(a);
	
  }
}