//String Uppercase Convert

import java.util.*;
import java.util.stream.*;
public class strinUpperconver
{
  public static void main(String x[])
  {
   List<String> list=Arrays.asList("React","Java","Python");
   list.stream()
   .map(String::toUpperCase)
   .forEach(System.out::println);
  }
}