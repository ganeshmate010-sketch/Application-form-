public class Capp
{
  public static void main(String x[])
  {
    /* int a=11,b=10;
	boolean result=a>b;
	System.out.printf("Result %d\n",result); */
	/* 
	//conditional 
	int a=10,b=20;
	String msg=a>b?"A is greater":"  B Is Greater";
	System.out.println(msg); */
	
	//type casting 
	int a=Integer.parseInt(x[0]);
	int b=Integer.parseInt(x[1]);
	String msg=a>b? "A is greater":"B is greater";
	System.out.println("Type castin Integer to String"+msg);
	
  }
}