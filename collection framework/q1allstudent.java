/* Q1. Problem Statement
Create a Student POJO class with fields id, name, and marks.
Store student objects in a Vector.
Perform the following operations:
Display all students
Calculate average marks
Display students scoring above average
Assign grade based on marks
 Input :- 1 Amit 78
  2 Neha 85
  3 Rahul 65
  4 Sneha 90

Output :-  Average Marks: 79.5
     Above Average Students: Neha , Sneha
Explanation
Store all students in a Vector<Student>
Calculate total marks using loop
Find average
Compare each student's marks with average
Grade logic can be applied using conditions
 */

import java.util.*;
class Student
{
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks)
	
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getMark()
	{
		return marks;
		
	}  
	//Assign grade based on marks

		public String getGrade()
	     {
		if(marks>=85)
		return "A";
		else if(marks>=70)
			return "B";
		
		else if(marks>=50)	
			return "C";
		else
			return "Fail";		
	     }
	
	
	
}
public class q1allstudent
{
	public static void main(String x[])
	{
		Vector<Student> v=new Vector<>();
		v.add(new Student(1,"Amit",78 ));
		v.add(new Student(2, "Neha", 85));
        v.add(new Student(3, "Rahul", 65));
        v.add(new Student(4, "Sneha", 90));
		
		System.out.println("Display all Student");
		int totalMarks=0;
		//display all Student
		for(Student s:v)
		{
			 System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getMark()+"\t"+s.getGrade());
			
			totalMarks += s.getMark();
		}
			//Calculate average marks
			double average=(double)totalMarks/v.size();
			System.out.println(" Average Mark of all Student::"+average);
			
			//Display students scoring above average
			for(Student s:v)
			{
				if(s.getMark() > average)
				{
					System.out.println(s.getName()+"\t"+s.getMark());
				}
				
			}
		

	
	}
}


      
       
       

        
           
        

    