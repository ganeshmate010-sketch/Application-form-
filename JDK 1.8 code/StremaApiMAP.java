import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StremaApiMAP
{
 public static void main(String x[])
 {
  List<Integer> list=List.of(10,20,30,40,50);
  Stream<Integer> s1=list.stream();
  Function<Integer,Integer> f=new Function<Integer,Integer>()
  {
	public Integer apply(Integer val)
	{
		return val*val;
	}	
  };
  Stream<Integer> s2=s1.map(f);
  Consumer<Integer> c=new Consumer<Integer>()
  {
	  public void accept(Integer val)
	  {
		  System.out.println(val);
	  }
  };
  s2.forEach(c);
 } 
}