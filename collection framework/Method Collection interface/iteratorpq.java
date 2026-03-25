import java.util.*;
public class iteratorpq
{
	public static void main(String x[])
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
	}
}