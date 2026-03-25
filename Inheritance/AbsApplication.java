import java.util.*;
abstract class Employee
{
	 abstract void skill();
}
class Developer extends Employee
{
	void skill()// abstraction implementation using overriding 
	{
		System.out.println("Need good in coding");
	}
}
 class Cook extends Employee
 {
	 void skill()
	 {
		 System.out.println("Good cooking ");
		 
	 }
	
 }
 class Hire
	 {
		 void hireEmployee(Employee e)
		 {
			 e.skill();
		 }
	 }
public class AbsApplication
{
 public static void main(String x[])
 {
  Hire h=new Hire();
  Employee e=new Developer();//upcasting //loosecupling
  h.hireEmployee(e);//behave as developer employee
  e=new Cook();
  h.hireEmployee(e);//behave as cook employee
 }
}