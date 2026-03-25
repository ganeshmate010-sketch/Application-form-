import  java.util.*;
public class ChartApplition
{
 public static void main(String x[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the charter:");
   char ch=sc.nextLine().charAt(0);
   if(ch>=65 && ch<=90)
   {
	   ch=(char)((int)ch+32);
   }
   else
   {
	   ch=(char)((int)ch-32);
   }
  System.out.println(ch);

 }
}

//code use the in captipal letter asel tr ti small hoto
//and small letter to capital hoto