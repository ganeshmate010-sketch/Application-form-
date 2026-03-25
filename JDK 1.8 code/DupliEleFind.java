//Find dublicates emlement in use the stream 
import java.util.*;
import java.util.stream.*;
public class DupliEleFind
{
  public static void main(String x[])
  {
	  List<Integer> list=Arrays.asList(10,20,30,10,20,50);
	  Set<Integer> set=new HashSet<>();
	  list.stream()
	  .filter(n->!set.add(n))
	  .forEach(System.out::println);
  }
}