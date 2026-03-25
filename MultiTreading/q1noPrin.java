/* Q1. Create two threads:
Thread 1 prints numbers from 1–5
Thread 2 prints numbers from 6–10
Both threads should run simultaneously.
Output: 1 6 2 7 3 8 4 9 5 10
Explanation:
Two threads execute independently. Since scheduling is controlled by JVM, output order may differ.
 */
 
 class NumberA extends Thread
 {
	 public void run()
	 {
		   try
		   {
			   for(int i=1; i<5; i++)
		     {  
	            System.out.printf("%d\n",i);
				sleep(2000);
			 
		      }
		   }
		   catch(Exception ex)
		   {
			 System.out.print(ex);   
		   }
	 }

	 
 }
 
 	 class B extends  Thread
	   {
		    public void run()
	 {
		   try
		   {
			   for(int i=6; i<=10; i++)
		     {  
	            System.out.printf("%d\n",i);
			     sleep(2000);
		      }
		   }
		   catch(Exception ex )
		   {
			 System.out.print(ex);   
		   }
	 }
	   
 }
public class q1noPrin
{
   public static void main(String x[])
   
 {
        NumberA n=new NumberA();
		n.start();
		
		B b=new B();
		b.start();
		
 }
}

//Output: 1 6 2 7 3 8 4 9 5 10
