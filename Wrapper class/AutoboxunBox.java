public class AutoboxunBox
{
 public static void main(String x[])
 {
	 int a=10;
	 Integer b=a;//autoboxing
	 System.out.println("Autoboxing\n"+b);
	 
	 Integer c=200;
	  b=c;//autounboxing
	 System.out.println("Unboxiing\n"+b);
 }
}   
/* output:
Autoboxing
10
Unboxiing
200 */