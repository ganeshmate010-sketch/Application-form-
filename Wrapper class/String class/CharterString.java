//String(char[]): this constructor is used for converting character arrays into string format.
public class CharterString
{
	public static void main(String x[])
	{
		char ch[]=new char[]{'a','b','c','d','e'};
		String s=new String(ch);
		System.out.println("Charater--->"+s);
	}
}

/* output
CharterString
 */