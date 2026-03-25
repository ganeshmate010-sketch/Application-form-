import java.util.*;
public class Valueofmethod //valueOf method is primitive is convert is reference datatype it is static method present in every wrapper class like as convert integer to String , float to String ,Integer primitive to float reference etc.
{
	public static void main(String x[])
	{
		int a=1234;
		String s=String.valueOf(a);//convert  primitive to reference
		System.out.println("--->"+a);
		Float fobje=Float.valueOf(a);
		System.out.println("Floating--->\t"+fobje);
	}
}