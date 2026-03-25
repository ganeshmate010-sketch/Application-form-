/* 11. Reverse ArrayList
Problem Statement:
Reverse elements of an ArrayList.
Input:	
[1,2,3,4]
Output:
[4,3,2,1]
Explanation:
Use Collections.reverse().
 */
 
import java.util.*;
public class q11ReverseArray
{
  public static void main(String x[])
  {
   ArrayList<Integer> a=new ArrayList<>();
   a.add(1);
   a.add(2);
   a.add(3);
   a.add(4);
   Collections.reverse(a);
   System.out.println("Reverse<-->"+a);
   
  }
  
}