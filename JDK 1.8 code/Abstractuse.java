abstract class Test
{ 
 abstract void show();
}
 
public class Abstractuse 
{
 public static void main(String x[])
 {
  /* Test t=new Test()
  {
	public void show()
	{
		System.out.println("I am show the Abstract Method ");
		
	}	
  };
  t.show(); */
    
	Test t=new Test ()
	{
	  public void Show()
	  {
		  System.out.println("I Am Show the Method");
	  }	  
	};
 }
}