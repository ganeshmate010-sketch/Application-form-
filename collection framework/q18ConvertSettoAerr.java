/* 18. Convert Set to Array
Problem Statement:
Convert a HashSet into an integer array.
Input:
Set = [10,20,30]
Output:
Array = 10 20 30
Explanation:
Use toArray(). */

import java.util.*;
public class q18ConvertSettoAerr
{
 public static void main(String x[])
 {
   HashSet<Integer> hs=new LinkedHashSet<>();
   hs.add(10);
   hs.add(20);
   hs.add(30);
   System.out.println("HashSet-->"+hs);
   
        Integer[] arr=hs.toArray(new Integer[0]);
		
		System.out.println("Array-->");
		for(int i: arr)
		{
			System.out.println(i+"");
		}
 }
}

