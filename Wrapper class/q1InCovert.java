//number class conversion the  primitive 
public class q1InCovert
{
	public static void main(String x[])
	{
		Number n=new Integer(10);
		int a=n.intValue();
		double d=n.doubleValue();
		System.out.println("Integer value\n:"+a);
		System.out.println("Double value\n"+d);
		
	}
}

/* output
Integer value
10
Double value
10.0 */