//Employee Slary filter 
import java.util.*;

class Employee
{
 int id;
 String name;
 double salary;

 Employee(int id,String name,double salary)
 {
  this.id=id;
  this.name=name;
  this.salary=salary;
 }
}

public class SalrtFilter
{
 public static void main(String x[])
 {
  List<Employee> list=new ArrayList<>();

  list.add(new Employee(1,"Ganesh",200000));
  list.add(new Employee(2,"Amit",60000));
  list.add(new Employee(3,"Neha",45000));
  list.stream()
      .filter(e -> e.salary > 40000)
      .forEach(e -> System.out.println(e.name+" "+e.salary));
 }
}