/* Q9.Problem Statement:
Create a thread and set its name as “MyThread”.
Example Input:
 No input
Example Output:
 Thread Name: MyThread
Explanation:
Use setName("MyThread") before starting the thread. */

class A extends Thread
{
  public void run()
  {
	  System.out.println("Thread Name:"+Thread.currentThread().getName());
  }  
}
public class q9
{
  public static void main(String x[])
  {
     A a=new A();
	 a.setName("MyThread");
	 a.start();
  }
}