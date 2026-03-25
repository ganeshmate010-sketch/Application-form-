import java.util.*;
class A extends Thread
{
	public void  run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println(i);
			
		}
	}
}
public class isalivemethod
{
	public static void main(String x[])
	{
		A a=new A();
		a.start();
		System.out.println(a.isAlive());//isAlive method use current program run is live is not is return  true and false
		
		
	}
}

/* output
true
0
1
2
3
4
5 */