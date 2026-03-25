//String(byte[],int offset,int length): this constructor can convert specified length of byte array in string format.

import java.util.*;
public class byteint
{
	public static void  main(String x[])
	{
		byte b[]=new byte[]{97,98,99,100,110};
		System.out.println("---->"+b);
		String s=new String(b,1,2);
		String s1=new String(b);
		System.out.println("----->:\t"+s1);
		System.out.println("->\t"+s);
	}
}
/* output
---->[B@21a947fe
----->: abcdn
->      bc */
