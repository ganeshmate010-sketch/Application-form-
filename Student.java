public class Student
{  private int id;
	private String name;
	private String course;
	private int age;
	
	Student(int id, String name, String course,int age)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.age=age;
		
	}
	//getter and setter
	public int getId()
	{
		return id;
	
	}
	public String getName()
	{
		return name;
	}
	public String getCourse()
	{
		return course;
	}
	public int getAge()
	{
		return age;
		
	}
	public void setName(String name)
	{
		this.name=name;
	
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	//display the all 
	public void display()
	{
		System.out.println(id+" "+name+" "+course+" "+age);
	}
	
}