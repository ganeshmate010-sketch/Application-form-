import java.util.*;
public class Billcalaculate
{
  public static void main(String x[])
  {
   int mur,pur;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the mur");
   mur=sc.nextInt();
   System.out.println("Enter the pur");
   pur=sc.nextInt();
   
   int total=mur*pur;
   
   if(total>10000)
   {
    total=total-(total*10/100);
	
   }
   System.out.println("Bill of the -->"+total);
   
   
  }
}