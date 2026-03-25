//Runnable using lambda expression

public class Aiappp
{
	public static void main(String x[])
	{
	Runnable r=()->{
	 try
	 { 
	   for(int i=1; i<=5; i++)
	   {
	     System.out.println("I am \t"+i);
		 Thread.sleep(1000);
		 
	    }
	   
	 }
	 
	 catch(Exception ex)
	 {
	 System.out.println(ex);
	  }
	};
	Thread t=new Thread(r);
	 t.start();
	}
}