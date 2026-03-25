

/* Q6. Set thread names as "StudentThread" and "TeacherThread".
Output:
StudentThread is running
TeacherThread is running
Explanation:
Use setName(). */

 class A extends Thread
{
 public void run()
 {
	 System.out.println(getName());
 }
}
class B extends Thread
{
 public void run()
 {
	 System.out.println(getName() );
 }
}


public class q6Current
{
	public static void main(String x[])
	{
		A a=new A();
		a.setName("StudentThread is running");
		a.start();
		 B b=new B();
		 b.setName("TeacherThread is running");
		 b.start();
		 
	}
}