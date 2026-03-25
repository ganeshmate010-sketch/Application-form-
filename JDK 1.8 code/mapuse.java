import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class mapuse
{
 public static void main(String x[])
 {
   List<Integer> list=List.of(10,20,30,40,50);
   list.stream()
   .map(n->n*2)//20,40,60,80,100
   .forEach(System.out::println); 
   //output 20,40,60,80,100
 }  
}