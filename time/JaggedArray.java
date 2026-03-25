import java.util.*;
public class JaggedArray
{
 public static void main(String x[])
 {
   int [][] a=new int[3][];
     a[0] = new int[3];  // 3 elements
     a[1] = new int[5];  // 5 elements
     a[2] = new int[2];  // 2 elements
   a[0][0] = 10;
   a[1][3] = 40;
   a[2][1] = 20;
   
   for(int i=0; i<a.length; i++)
   {
     for(int j=0; j<a[i].length; j++)
	 {
	   System.out.print(a[i][j]+" ");
	   
	 }
	 System.out.println( );//space the row
   }
   
 }
}