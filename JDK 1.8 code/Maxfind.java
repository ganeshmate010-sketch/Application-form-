//Maximum Number

import java.util.*;
public class Maxfind
{
 public static void main(String x[])
 {
  List<Integer> list=Arrays.asList(10,50,60,80,90);
  
   int max=list.stream()
     .max(Integer::compare)
	 .get();
	 System.out.println("maximum number:"+max);
 }
 
}