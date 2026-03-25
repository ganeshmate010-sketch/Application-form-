class Sum
{
	void calSum(int []...x)
	{
		for(int i=0; i<x.length; i++)
		{
		  for(int j=0; j<x.length; j++)
		  {
			  System.out.printf("\t"+x[i][j]);
			  
		  }	
			System.out.printf("\n");//space
		}
	}
}
public class Matrixof
{
	public static void main(String x[])
	{
		Sum s=new Sum();
		s.calSum(new int[]{1,2,3,},new int[]{4,5,6},new int[]{7,8,9});
		System.out.println(s);
	}
}