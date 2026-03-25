/* Q3. Create a class implementing Runnable that prints "Hello Multithreading" 5 times.
Output:
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Explanation:
Thread is created using:
Thread t = new Thread(obj);
t.start(); */

class A implements Runnable
{  
  public void run()
  {
	  for(int i=0; i<=5; i++)
	  {
		  System.out.println("Hello Multithreading");
	  }
  }
  
}

public class q3thrreObj
{
	public static void main(String x[])
	{
		A a=new A();
	
    Thread t= new Thread(a);
	t.start();
	}
}
/* Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading
Hello Multithreading */