import java.util.*;
public class Distinitmethod
{
public static void main(String x[])
{
  List list=Arrays.asList(10,20,30,40,10,20,50);
  list.stream()
  .distinct()
  .forEach(System.out::println);
}
}