/* Q2. Create two threads:
One thread for even numbers (1–20)
One thread for odd numbers (1–20)
Output:
Odd: 1
Even: 2
Odd: 3
Even: 4
Explanation:
Each thread checks condition (i % 2 == 0) and prints accordingly.
 */

class A extends Thread
{
  public void run()
  { 
   try
   {
   for(int i=1; i<=20; i++)
   {
	   if(i%2!=0)
	   {
		   System.out.println("Odd--->"+i); 
		   sleep(1000);
	   }
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
	 for(int i=1; i<=20; i++)
	 {
		 if(i%2==0)
		 {
			 System.out.println("Even-->"+i);
			 sleep(1000);
		 }
	 }
	  }
	  catch(Exception ex)
	  {
		  System.out.println(ex);
	  }
 }
	
}
public class EvenOddNumber
{
	public static void main(String x[])
	{
	 A a=new A();
      a.start();
     B b=new B();
       b.start();
	   
	}
}
