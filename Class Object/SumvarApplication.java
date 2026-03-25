
class Sum
{ void calSum( int ...b)
  {
	  int s=0;
	  for(int i=0; i<b.length; i++)
	  {
		  s=s+b[i];
		  
	  }
	  System.out.println("Sum of all valeus\t"+s);
  }
}
public class  SumvarApplication
{
	public static void main(String x[])
	{
		Sum s=new Sum();
		int a[]=new int[]{10,20,30,40};
		
		s.calSum(a);
		System.out.println("\t"+s);
	}
}