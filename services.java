import java.util.*;
import java.util.List;
public interface services
{
	Student registerstudent(String name,Sting course,int age)//auto genrate id
	List<Student> getAllStudent();
	boolean deleteStuden(int id);
	Student searchStudent(int id);
	boolean updatesStudent(int id ,String name, String course,int age);
	
}
public class StudentServiceImp implements services{


    private List<Student> studentList = new ArrayList<>();

    private int generateId() {
        return studentList.size() + 1; // Auto-generate ID
    }

    @Override
    public Student registerStudent(String name, String course, int age) {
        int id = generateId();
        Student student = new Student(id, name, course, age);
        studentList.add(student);
        return student; // Return object for "registration complete" message
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public boolean deleteStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student searchStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean updateStudent(int id, String name, String course, int age) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setCourse(course);
            s.setAge(age);
            return true;
        }
        return false;
    }