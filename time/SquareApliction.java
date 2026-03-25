class Square
{ int no;
   void setValue(int x)
   { no=x;
   } 
   void showDispl()
   {
  System.out.println("Square of ------>"+no*no);
  }
}
public class SquareApliction
{
public static void main(String x[])
{
  Square s=new Square();
     s.setValue(10);
	 s.showDispl();
	 System.out.println(s);
}
}