//How to use interface using anonymous inner class
interface Test
{
	  
	  abstract void show();
}
public class InterfaceAnnony
{
 public static void main(String x[])
 {
  Test t=new Test()
  {
	  public void show()
	  {
		   System.out.println("I am is show method");
	  }
  };
  t.show();
 }
 
}