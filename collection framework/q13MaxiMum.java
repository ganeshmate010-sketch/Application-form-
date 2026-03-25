/* 13. Find Maximum Value in ArrayList
Problem Statement:
Find maximum value stored in an ArrayList.
Input:
[10, 50, 20, 80, 40]
Output:
Maximum = 80
Explanation:
Use Collections.max(). */

import java.util.*;
public class q13MaxiMum
{
  public static void main(String x[])
  {
   ArrayList<Integer> li=new ArrayList<>();
   li.add(10);
   li.add(50);
   li.add(20);
   li.add(80);
   li.add(40);
   
   int Max=Collections.max(li);
   System.out.println("maximum\n"+Max);
  }
} 