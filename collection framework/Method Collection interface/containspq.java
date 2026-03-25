import java.util.*;
public class containspq
{
public static void main(String x[])
{
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	
	boolean b=a.contains(20);
	if(b)
	{
		System.out.println("Present element");	
		
	}
	else
	{
		System.out.println("Not present");
	}

}
}