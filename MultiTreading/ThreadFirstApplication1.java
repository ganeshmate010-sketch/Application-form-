class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=6; i++)
			{
				System.out.println("First = %d\t"+i+"\t"+isAlive());
				if(i==3)
				{
					stop();
				}
				Thread.sleep(1000);
				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
	
}

class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=50; i++)
			{
				System.out.println("Second = %d\t"+i);
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			
		}
	}
}

public class ThreadFirstApplication1
{
  public static void main(String x[]) 
  { 
    First f=new First();
	f.start();
	Second s=new Second();
	s.start();
   
  }
}