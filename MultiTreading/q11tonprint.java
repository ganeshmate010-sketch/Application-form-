/* Q1.Problem Statement:
Write a Java program to create a thread by extending the Thread class that prints numbers from 1 to N.
Example Input:
 N = 5
Example Output:
 1
 2
 3
 4
 5
Explanation:
Create a class that extends Thread and overrides the run() method. Inside run(), print numbers from 1 to N. In main(), create the object and call start() to execute the thread. */

import java.util.*;
class A extends Thread
{   int n;
	  A(int n)
	  {
		  this.n=n;
		  
	  }
	  
	public void run()
	{  
		for(int i=1; i<=n; i++)
		{
			 System.out.println("number"+i);
		}
	}
}
public class q11tonprint
{
  public static void main(String x[])
  {    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number\t");
      int n=sc.nextInt();
	 A a=new A(n);
	 
	 a.start();
	 
	  
  }
}
