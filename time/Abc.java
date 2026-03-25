import java.util.*;

class A extends Thread
{
	
	  public void run()
	 {    try
		 {
	 for(int i=1; i<=5; i++)
		 {
		  System.out.println("I Am Thread 1");
		  System.out.println(isAlive());
		  sleep(1000);
		 
		 }
	 }
	 catch(Exception ex)
	{
		System.out.println(ex);
	}
	}
	
}
class B extends Thread
{
 
	 public void run()
	 {  try
		 {
			 for(int i=1; i<=5; i++)
		 {
		  System.out.println("I Am Thread 1");
		  
		 }
	 }
	 catch(Exception ex)
	{
		System.out.println(ex);
	}
	}
}
	
public class Abc
{
 public static void main(String x[])
 {
   A a=new  A();
   
   a.start();
   B b=new B();
   b.start();
   
 }
}
