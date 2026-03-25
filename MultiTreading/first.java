class  demo extends Thread
{
  public void run()
  {
   for(int i=0; i<=5; i++)
   { 
     System.out.printf("First==%d\n",i);
   }
  }
}
public class first
{
	public  static void main(String x[])
	{
		demo  d=new demo();
		d.start();
	}
}