//If function contain return statement with single line not need to write write keyword 
 /* जर Lambda expression मध्ये फक्त एकच expression असेल, तर return keyword आणि {} brackets लिहायची गरज नसते.*/
 
 interface Square 
 {
  int getSquare(int no);//publi abstract int getSquare(int no);
  }
  public class ReturLambdaExpre
  {
   public static void  main(String x[])
   {
/*        Square s=(int no)->no*no;//5*5;
	 
	  System.out.println(s.getSquare(5)); */
	  System.out.println(((Square)(int no)->no*no).getSquare(5));
   }
  }