/* Q4. Create a thread that prints numbers from 1–5 with 1-second delay between each number.
Output:
1 (1 sec delay)
2 (1 sec delay)
...
Explanation:
Use Thread.sleep(1000) inside loop.
 */
class A extends Thread
{
 public void run()
 {
  try
  {
	   for(int i=1; i<=5; i++)
   {
    System.out.println(i);
	Thread.sleep(1000);
   }
  }
  catch(Exception ex)
  {
	  System.out.println(ex);
  }
 }
}
public class q4
{
  public static void main(String x[])
   {
    A a=new A();
	a.start();
  } 
}