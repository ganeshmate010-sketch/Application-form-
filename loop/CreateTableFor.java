import java.util.*;
public  class CreateTableFor
{
  public static void main(String x[])
  {
    Scanner sc=new Scanner(System.in);
	int no,tab;
	System.out.println("Enter the value ");
	no=sc.nextInt();
	int i=1;
	while(i<=10)
	{
		tab=no*i;
		System.out.printf("%d\n",tab);
		i++;
	}
	
	
  }
 }