/* Q1.Write a Java program that stores integer values in an array and prints all elements using a Lambda Expression.
Input:
 Array Elements: 10 20 30 40 50
Output:
Array Elements are:
10
20
30
40
50
 */
import java.util.*;


public class Arrayconvertlamabda
{
 public static void main(String x[])
 {
	  Integer a[]={10,20,30,40,50};
	  List<Integer> li=Arrays.asList(a);
	  System.out.println("Array Element are:");
	  li.forEach(n->System.out.println(n));

 }
}
