
public class methoduseclass
{
	public static void main(String x[])
	{
		Float a=100.4f;
		System.out.println("Float number\n"+a);
		int d=a.intValue();//method use number class method 
		long c=a.longValue();
		
		System.out.println("Interger number\n"+d);
		System.out.println("long convert\n"+c);
	}
}
/* output
Float number
100.4
Interger number
100
long convert
100 */