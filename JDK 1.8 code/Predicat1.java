import java.util.*;
import java.util.function.Predicate;
public class Predicat1
{
 
  public static void main(String x[])
  {
    Predicate<Integer> p=new Predicate<Integer>()// check the condition and return boolean true or flase  
	{ 
	 public boolean test(Integer i)
	 {
		 if(i>10)
			 return true;
		 else
			 return false;
	 }
	};
	System.out.println(p.test(30));
   }
  
}