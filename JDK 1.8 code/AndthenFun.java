import java.util.*;
import java.util.function.*;
public class AndthenFun
{
 public static void main(String x[])
 {
  Function<Integer,Integer> f=new Function<Integer,Integer>()
    {
	  public Integer apply(Integer val)//10
	  {
	   return val*val; //10*10=100;
	  }
	};
	Function<Integer,Integer> f1=new Function<Integer,Integer>(){
	 public Integer apply(Integer val)//100
	 {
	  return val*val*val;//100*100*100=1000000
	 }
	};
	Function<Integer,Integer> f3=f.andThen(f1);
	Integer result=f3.apply(10);
	System.out.println(result);//1000000
	
 }
}