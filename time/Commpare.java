import java.util.*;
public class Commpare
{
  public static void main(String x[])
  { 
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size");
   int n=sc.nextInt();
   
     ArrayList<Integer> arr=new ArrayList<>();
	 System.out.println("Add elemet");
   for(int i=0; i<n; i++)
   { 
      arr.add(sc.nextInt());
   }
   
   //compare 
   int count=0;
   for(int  i=0; i<arr.size(); i++)
   {
	    for(int j=i+1; j<arr.size(); j++)
		{
			if(arr.get(i).equals(arr.get(j)))
			{
				System.out.printf(" Dubalicate Element : \n " +arr.get(j));
				count++;
			}
		}
   }
   System.out.println("Total Dubalicate\n"+count);
 

   
  }
}