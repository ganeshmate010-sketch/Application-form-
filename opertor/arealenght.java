/* 
Q 4. Write a java program to enter length and breadth of a rectangle and find its area.
Formula - area= length * breadth; */
 
import java.util.*;
public class arealenght
{
	public static void main(String x[])
	{
		int area , length,breadth;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length\t ");
		length=sc.nextInt();
		System.out.println("Enter the breadth\t");
		breadth=sc.nextInt();
		area=length*breadth;
		System.out.println("rectangle and find its area\t"+area);
		
	}
}