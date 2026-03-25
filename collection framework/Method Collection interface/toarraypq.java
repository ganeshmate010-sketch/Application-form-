import java.util.*;
public class toarraypq
{
	public static void main(String x[])
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Object obj[]=a.toArray();
		for(Object o:obj)
		{
			System.out.println(o+"\t");
		}
	}
}