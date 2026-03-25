class start1 extends Thread
{
  public  void run()
  {
         System.out.println("Thread----------<.");
  }
}

public class Startmethod
{
  public static void main(String x[])
  {
    start1 s=new start1();
	s.start();
  }
} 