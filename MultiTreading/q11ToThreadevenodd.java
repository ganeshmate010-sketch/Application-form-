 /* Q11.Problem Statement:
Create two threads. One prints even numbers and another prints odd numbers from 1 to N.
Example Input:
 N = 10
Example Output:
 Odd: 1 3 5 7 9
 Even: 2 4 6 8 10
Explanation:
Create two separate Runnable classes and start both threads. */



class A extends Thread 
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number:"+i);
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			 if(i%2!=0)
			 {
			   System.out.println("Odd Number:"+i);
			 }
		}
	}
	
}
public class q11ToThreadevenodd
{
   public static void main(String x[]) throws Exception
   {
      	    A a=new A();
			 a.start();
			 a.join();
			 
			 B b=new B();
			 b.start();
			 
   }
}