import java.util.*;
public class q1pattern
{
 public static void main(String x[])
 {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number:\n");
	 int n=sc.nextInt();
	 for(int i=1; i<=n; i++)
	 {
		 for(int j=1; j<=i; j++)
		 {
			 System.out.printf(j+" ");
		 }
		 System.out.println();
	 }
	 System.out.println();
	 	 for(int i=n; i>=1; i--)
	 {
		 for(int j=1; j<=i; j++)
		 {
			 System.out.printf(i+" ");
		 }
		 System.out.println();
	 }
 }
}
/* 
output
Enter the number:
5

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

5 5 5 5 5
4 4 4 4
3 3 3
2 2
1 */