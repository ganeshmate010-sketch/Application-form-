import java.util.*;
public class OAPP
{
	public static void main(String x[])
	{
		int result= square(5); //call integer
		
		square(5.5f);//call float
		System.out.println("square of Integer"+result);
	}
	public static int square(int no)
	{
		return no*no;
	}
	public  static void square(float x)
	{
		System.out.println("Square to float"+(x*x));
	}
	
}