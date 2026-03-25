class Printer
{
	static int count;
	void printDocument(String document)
	{
		synchronized(this)
		{
			System.out.println(Thread.currentThread().getName()+"preparing  to print "+document);
			System.out.println(Thread.currentThread().getName()+"is printing "+document);
			try
			{
				Thread.sleep(1000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}
	
}
class PrintThread extends Thread
{
	Printer p;
	String doc;
	void setPrime(Printer p,String doc)
	{
	  this.p=p;
	  this.doc=doc;
	  
	}
	public void run()
	{
		p.printDocument(doc);
		
	}
}

public class SBApplication
{
  public static void main(String x[])
  {
    Printer p=new Printer();
	p.setName("First");
	p.setPrime(printer,"First.doc");
	PrintThread p2 = new PrintThread();
		p2.setName("Second");
		p2.setPrinter(Printer,"Second.doc");
		p1.start();
		p2.start();

	
  }
}