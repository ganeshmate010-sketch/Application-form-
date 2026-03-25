import java.util.*;
public class PowerNumber
{
 public static void main(String x[])
 {
    Scanner sc=new Scanner(System.in);
	int d,ind;
	System.out.println("Enter the base And index value");
	d=sc.nextInt();
	ind=sc.nextInt();
	int result=getPower(d,ind);
	System.out.println("Power is-->"+result);
	
	
	
  }
  public static int getPower(int base, int index)
  {
	  int p=1;
	  while(index!=0)
	  {
		  p=p*base;
		  --index;
		  
	  }
	  return p;
  }
}