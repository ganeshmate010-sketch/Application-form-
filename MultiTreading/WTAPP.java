public class WTAPP
{
  public static void main(String x[])
  { 
   Thread t=Thread.currentThread();
   String threadName=t.getName();
   System.out.println("Thread Name\n"+threadName);
   System.out.println("Priority of main thread\n"+t.getName());
  }
}