import java.util.*;
public class secondlargestnumber
{
  public static void main(String x[])
  {
    List<Integer> list=Arrays.asList(10,40,50,60,90);
	
	int Secondlagerst=list.stream()
	    .sorted(Collections.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		System.out.println("Second---->"+Secondlagerst);
  }
}