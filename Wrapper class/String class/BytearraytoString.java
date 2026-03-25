//String(byte[]): this constructor is used for converting byte arrays into string format using ascii values. 


import java.util.*;
public class BytearraytoString
{
	public static void main(String x[])
	{
		 byte b[]=new byte[]{97,98,99,100,110};
		 String s=new String(b);
		 System.out.println(s);
	}
}