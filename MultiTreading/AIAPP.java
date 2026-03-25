public class AIAPP
{
 public static void main(String x[])
 {
	 Thread t=new Thread()
	 {
		 public void run()
		 {
       try
     {
   
	 for(int i=0; i<=5; i++)
	  {
	   System.out.println("is am\n"+i);
	   Thread.sleep(1000);
	   
	 }
	}
	 catch(Exception ex)
	 {
	 System.out.println(ex);
	 }
		 }
	 };
   t.start();	 
 }
 
}