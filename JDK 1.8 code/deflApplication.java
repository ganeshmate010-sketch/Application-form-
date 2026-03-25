//Interface with default methods :  if we use the default keyword with a method within an interface then we can write a definition of that method within the interface.

 interface A 
 {
	 default void show()
	  {
		  System.out.println("i am Show Default");
	  }
 }
 class B implements A
 {
	 
 }
public class deflApplication
{
  public static void main(String x[])
  {
	  B b=new B();
    b.show();
  }
}