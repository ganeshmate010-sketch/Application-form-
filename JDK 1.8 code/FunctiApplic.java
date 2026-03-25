import java.util.*;
import java.util.function.*;

public class  FunctiApplic
{
  public static void main(String x[])
  {
	  Function<Integer,Integer> f=new Function<Integer,Integer>()
	  {
		  public Integer apply(Integer val)//10
		  {
			  return val*val;//10*10=100
			  
		  }
	  };
	  Integer result=f.apply(10);
	  System.out.println("Result-->"+result);//output==> 100
	  
  }
}