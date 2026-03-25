/* 20. Replace Value in HashMap
Problem Statement:
Replace marks of a student in HashMap.
Input:
Ravi = 60
Update Ravi = 85
Output:
Ravi = 85
Explanation:
Use map.replace().

 */
 import java.util.*;
public class q20replaceValue
{
 public static void  main(String x[])
 {
   HashMap<String ,Integer> m=new HashMap<>();
   m.put("ravi",60);
   
   m.replace("ravi",85);
   System.out.println("Replece---->"+m.get("ravi"));
 }
}