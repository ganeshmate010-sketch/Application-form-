 //we want to create simple thread example using lambda expression

public class ThreaLambdaUse
{
 public static void main(String x[])
 {

  new Thread(()->
   {
     try{
		 for(int i=1; i<=5; i++)
		 {
			 System.out.println("Hello"+i);
			 Thread.sleep(1000);
		 }
	 }
	 catch(Exception ex)
	 {
		 System.out.println("Error "+ex);
	 }
  }).start();

 }
}