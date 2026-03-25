import java.util.*;
import java.util.function.*;

public class ComezoneAppl
{
 public static void main(String x[])
 {
  Function<Integer,Integer> f=new Function<Integer,Integer>()
  {
	   public Integer apply(Integer val)//400
	   {
		   return val* val;//400*400=160000	   
		   }
  };
  Function<Integer,Integer> f1=new Function<Integer,Integer>()
  {
	  public Integer apply(Integer val)//20
	  {
		  return val*val;//20*20=400
	  }
  };
  Function<Integer,Integer> f3=f.compose(f1); //this the first value second function f1 send   ntr to f la send krto
  
  
  Integer result=f3.apply(20);
  System.out.println(result);

 }
}