/* Q10. Problem Statement:
Create two threads and assign different priorities.
Example Input:
 No input
Example Output:
 Thread-1 Priority: 8
 Thread-2 Priority: 3
Explanation:
 Use setPriority() method. Priority ranges from 1 to 10. */


class A extends Thread
{
  public void run()
  {
   
	System.out.println("Thread-1:"+"Thread-->"+Thread.currentThread().getPriority());

  }
}

class B extends Thread
{
  public void run()
  {
   System.out.println("Thread-2:"+"Thread-->"+Thread.currentThread().getPriority());
   }
}

public class q10
{
 public static void main(String x[])
 {
     A a=new A();
	 a.setPriority(8);
	 a.start();
	 B b=new B();
	 b.setPriority(3);
	 b.start();
	 
 }
}