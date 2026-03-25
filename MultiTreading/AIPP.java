//. How to create a thread without implementing a runnable interface?

public class AIPP
{
	public static void main(String x[])
	{
		Runnable r=new Runnable()
		{
		 public void run()
		 {
			try
			{
			  for(int i=1; i<=5; i++)
			  {
			     System.out.println("I is \t"+i);
				 Thread.sleep(1000);
				 
			  }
			}
			catch(Exception ex)
			{
			 System.out.println(ex);
			}
		 }
		};
		
		Thread t=new Thread(r);
		t.start();
		
		
	}
}