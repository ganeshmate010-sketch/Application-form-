/* import java.util.*;
class Student
{	int id;
	String name;
	int mark;
	Student(int id, String name,int mark)
	{
		 this.id = id;
        this.name = name;
        this.marks = marks;
	}
}
class MerksComaprator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s2.marks-s1.marks;
	}
}
public class Employeee
{ public static void main(String x[])
	{
	 ArrayList list =new ArrayList();
	 list.add(10);
	 list.add(20);
	 list.add(30);
	 list.add(40);
	 list.add(50);
	 System.out.println(list);
	 
	 
	}
	
}
 */

import java.util.*;

// Student class
class Student {
    int id;
    String name;
    int mark;

    Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}

// Comparator class
class MarksComparator implements Comparator <Student> {
    public int compare(Student s1, Student s2) {
        return s2.mark - s1.mark; // descending order
    }
}

// Main class
public class Employeee {
    public static void main(String[] x) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Amit", 75));
        list.add(new Student(2, "Rahul", 85));
        list.add(new Student(3, "Suresh", 65));

        // Sorting using Comparator
        Collections.sort(list, new MarksComparator());

        // Display output
        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.mark);
        }
    }
}
