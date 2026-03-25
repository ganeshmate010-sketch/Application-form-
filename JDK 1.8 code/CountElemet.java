//count 
import java.util.*;;
public class CountElemet
{
 public static void main(String x[])
 {
  List list=Arrays.asList(10,20,30,40,50);
  
  long count=list.stream().count();
  System.out.println("Element count:"+count);
 }
}