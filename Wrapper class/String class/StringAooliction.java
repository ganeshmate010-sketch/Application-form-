public class StringAooliction
{
	public static void main(String x[])
	{
		String s1="Abc";
		String s2="Abc";
		System.out.println("hashcode-->Declare String class-->"+System.identityHashCode(s1));
		System.out.println("Hashcode-->Declare  String class-->"+System.identityHashCode(s2));
		String s=new String ("Abca");
		String s3=new String("abc");
		System.out.println("Hash code-->Create object in String --->"+System.identityHashCode(s));
		System.out.println("Hash code-->Creta oject in String--->"+System.identityHashCode(s3));
	}
}
/* output
:
hashcode-->Declare String class-->1268959798
Hashcode-->Declare  String class-->1268959798
Hash code-->Create object in String --->876926621
Hash code-->Creta oject in String--->326298949 */