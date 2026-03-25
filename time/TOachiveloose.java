import java.util.*;
class Value
{
	int x,y;
	void setValue(int x,int y )
	{
		this.x=x;
		this.y=y;
		
	}
	
	int getResult()
	{
		return 0;
	}
	
}
class A extends Value
{
	int getResult()
	{
		return x+y;
	}
}
class mul extends Value
{
	int getResult()
	{
		return x*y;
	}
	
}
class Calculator
{
	void Performoperation(Value v)
	{
		int result=v.getResult();
		System.out.printf("Result %d\n",result);
	}

}
public class TOachiveloose
{
 public static void main(String x[])
 {
   Calculator c=new Calculator();
Value v=null;
   v=new A();
   v.setValue(10,20);
c.Performoperation(v);
  v=new mul();
v.setValue(2,4);
c.Performoperation(v);  
 }
}