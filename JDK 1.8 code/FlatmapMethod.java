import java.util.*;
public class FlatmapMethod
{
 public static void  main(String x[])
 {
     List<List<Integer>> list=new ArrayList<>();
	
	 list.add(Arrays.asList(1,2));
	 list.add(Arrays.asList(3,4));
       list.add(Arrays.asList(5,6));
	  list.stream()
	  .flatMap(a->a.stream())
	  .forEach(System.out::println);
	  
 }
}