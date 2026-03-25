//max find

import java.util.*;
public class Array3
{
 public static void main(String x[])
 {
	 int a[]=new int[]{10,20,30,40,50};
	 System.out.println("Max find value");
	 int max=a[0];
	 for(int i=0; i<a.length; i++)
	 {
		 if(a[i]>max)
		 {
			 max=a[i];
		 }
	 }
	 System.out.println(max);
 }
}
/* output
D:\JAVA program\time>java Array3.java
Max find value
50 */
