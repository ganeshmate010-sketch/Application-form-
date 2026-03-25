/* Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
Formula :-
diameter=2 * radius;
circumference = 2 * 3.14 * radius; 
area = 3.14 * radius * radius; */

import java.util.*;
public class RdiuesAppliction
{
	public static void main(String x[])
	{
		float radius,diameter,area, circumference;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius");
		radius=sc.nextInt();
		
		diameter=2*radius;
		circumference=2 * 3.14f * radius;
		area=3.14f * radius *radius; //3.14 double  datatyepe aahe tyamule  ch pude (f)ha float madhe conver karna mule lavale aahe 
		
		System.out.println("radius\t"+radius);
		System.out.println("diameter\t"+diameter);
		System.out.println("circumference\t"+circumference);
		System.out.println("area\t"+area);
	}
	
}