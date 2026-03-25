/* Q8. Create two threads with priority 1 and 10. Print their priority.
 Explanation :- Use setPriority().
 */
 
 class A extends Thread
 {public void run()
   {
     System.out.println("Thread A priority"+getPriority());
   } 
  
 }
 class B extends Thread
 {public void run()
   {
     System.out.println("Thread B Priority"+getPriority());
   } 
  
 }


public class q8
{
  public static void main(String x[])
  {
    A a=new A();
	a.start();
	a.setPriority(1);
	B b=new B();
	b.start();
	b.setPriority(10);
	
  }
}