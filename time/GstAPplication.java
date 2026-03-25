public class GstAPplication 
{
	public static void main(String x[])
	{
		int qty=Integer.parseInt(x[0]);
		int rate=Integer.parseInt(x[1]);
		int total=qty*rate;
		int gstamt=(total*18)/100;
		total=total+gstamt;
		System.out.print("%d\t"+total);
		
	}
}