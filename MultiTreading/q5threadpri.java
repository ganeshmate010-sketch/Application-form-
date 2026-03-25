/* Q5. Create 2 threads and print their names using getName().
Output:
Thread-0
Thread-1
Explanation:
Default names are assigned by JVM.
 */
 
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
		 System.out.println(getName()); 
	 }
 }
public  class q5threadpri
{
 public static void main(String x[])
 {
	      A a=new A();
		  a.start();
		  B b=new B();
		  b.start();
 } 
}