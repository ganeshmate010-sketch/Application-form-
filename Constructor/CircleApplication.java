class Circle
{
   float pi,radius;
   Circle()
   {
	   pi=3.14f;
	   
   }
   void setRadius(float radius)
   {
	   this.radius=radius;
   }
   float getArea()
   {
	   return radius*radius*pi;
   }
}
public  class CircleApplication
{
	public static void main(String x[])
	{
		Circle c=new Circle();
		c.setRadius(3.0f);
		float result=c.getArea();
		System.out.println("Area of circle is"+result);
	}
}