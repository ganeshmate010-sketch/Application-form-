public class q3Array
{
 public static void main(String x[])
 {
     int a[]=new int[]{10,20,30,40,60};
	 int b[];
	 b=a;
	 b[2]=200;
	 System.out.println("Display Array:");
	 for(int i=0; i<a.length; i++)
	 {
		 System.out.printf("%d\t",a[i]);
		 
	 }
 }
}
