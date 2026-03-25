/* Q7. Create two threads:
Thread A prints 1–5
Thread B should start only after A finishes.
Explanation:
Use t1.join() before starting t2. */


class A extends Thread
{
	public void run()
	{
		 try
		 {
	 		 for(int i=1; i<=5; i++)
		     {
			 System.out.println(i);
			   sleep(1000);
			  }
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }
	}
}
class B extends Thread
{
	public void run()
	{
		 try
		 {
	 		 for(int i=1; i<=5; i++)
		     {
			   System.out.println(i);
			  }
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }
	}
}

public class q7
{
public static void main(String x[]) 
{
	A a=new A();
	a.start();
	
	try{
		a.join();
	}
	catch(InterruptedException ex)
	{
		System.out.println(ex);
	}
	B b=new B();
	b.start();
	
}
}