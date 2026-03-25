import java.util.function.Predicate;
public class PredcateAND
{
 public static void main(String x[])
 {
	 Predicate<Integer> p1=new Predicate<Integer>()
	 { 
		public boolean test(Integer n)        //note: Predicate is two combination generete is three  predicete with two condition if all condution 
		{
			return n>10;
		}		
	 };
	 
	 Predicate<Integer> p2=new Predicate<Integer>()
	 {
		 public boolean test(Integer n)
		 
		 {
			 return n<50;
		 }
	 };
	 Predicate<Integer> result=p1.and(p2);
	 System.out.println(result.test(30)); 
   
 }
}