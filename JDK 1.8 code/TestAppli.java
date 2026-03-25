
abstract class Test
{
	abstract void show();
}
public class TestAppli
{
 public static void main(String x[])
 {
  Test t=new Test()
  {
	  public void show()
	  {
	  System.out.println("I am show method");
	  }
  };
  t.show();
  
 }
}