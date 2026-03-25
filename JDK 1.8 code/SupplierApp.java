import java.util.function.*;
import java.util.Date;
public class SupplierApp
{
  public static void main(String x[])
  {
	   Supplier<Date> s=new Supplier<Date>()
	   {
		   public  Date get()
		   {
			   return new Date();
		   }
		  
	   };
	    Date d1=s.get();
		   System.out.println(d1);
  }
}