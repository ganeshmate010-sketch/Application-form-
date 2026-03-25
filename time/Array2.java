import java.util.*;
public class Array2
{
 public static void main(String x[])
 {
  int a[]=new int[]{10,20,30,40,50};
  int b[];
  b=a;
  b[2]=200;
  
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Display Array-->");
  for(int i=0; i<a.length; i++)
  {
    System.out.printf("%d\n",a[i]);
  }
  
  
 }
}

/* D:\JAVA program\time>java Array2.java
Display Array-->
10
20
200
40
50    
note   index number 2 la 200 print */