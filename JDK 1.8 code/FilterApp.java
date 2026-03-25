import java.util.*;

import java.util.function.*;
public class FilterApp
{
 public static void main(String x[])
 {
  List<Integer> list=List.of(1,2,3,4,5);
  list.stream()
  .filter(n->n%2==0)
  .forEach(System.out::println);
  
 }
}