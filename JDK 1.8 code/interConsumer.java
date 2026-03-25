
 import java.util.*;
import java.util.function.Consumer;

public class interConsumer
{
 public static void main(String x[])
 {
   List<Integer> a=Arrays.asList(10,20,30,40,50);
   Consumer<Integer> c=new Consumer<Integer>()
   {
	  public void accept(Integer n)
	  {
		  System.out.println(n);
	  }	  
   };
   a.forEach(c);
 }
}