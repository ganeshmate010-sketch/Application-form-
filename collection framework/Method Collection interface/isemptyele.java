import java.util.*;
public class isemptyele
{
	public static void main(String x[])
	{
		ArrayList<Integer> a=new ArrayList <>();
		
		boolean b=a.isEmpty();
		if(b)
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("Data is present");
		}
	}
}