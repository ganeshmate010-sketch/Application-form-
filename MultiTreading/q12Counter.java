/* Q12.Problem Statement:
Create a shared counter variable. Two threads increment the counter 5 times each.
Example Input:
 No input
Example Output:
 Final Counter Value: 10
Explanation:
Use synchronized keywords to avoid race conditions. */

class Counter{
	int count=0;
		public synchronized void increment()
		{
			count++;
		}
	
}
class MyThread extends Thread 
{
	 Counter c;
	 
	MyThread(Counter c)
	{
		 this.c=c;
	}
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			c.increment();
		}
	
	}
}
public class q12Counter
{

  public static void main(String x[])
  {
	 MyThread m=new MyThread(c);
	 MyThread m1=new MyThread(c);
	 m.start();
	 m1.start();
	 
	 m.join();
	 m1.join();
	 
	 System.out.println("Final counter"+c.count);
	  
  }
  
}