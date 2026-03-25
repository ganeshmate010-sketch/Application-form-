	import java.util.*;
	public class reduceMethod
	{
	 public static void main(String x[])
	 {
	  List<Integer> list=Arrays.asList(1,2,3,4,5);
		 int sum= list.stream() 
		.reduce(0,(a,b)-> a+b);
		System.out.println(sum);
	  
	 }
	}