import java.io.*;
public class DriveAppliction
{ 
  public static void main(String x[])throws Exception
  {
	  File f[]=File.listRoots();
	  for(int i=0; i<f.length; i++)
	  {
		  long 	totalSpace=f[i].getTotalSpace();
		    	  long freeSpace=f[i].getFreeSpace();
	     System.out.println(f[i]+"\t"+(totalSpace/1073741824)+" GB \t"+(freeSpace/1073741824) +" GB");


	  }
	  
  }
  
}
