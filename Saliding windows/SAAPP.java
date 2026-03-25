public class SAAPP
{   public static void main(String x[])
	{   int target=7;
     int a[]=new int[]{2,3,1,2,4,3};
     int sum=0,start=0;
	 int minLen=Integer.MAX_VALUE;
	 for(int end=0; end<a.length; end++)
	 {     sum=sum+a[end];
		   while(sum>=target)
		   {  int clen=end-start+1;
		      if(clen<minLen)
			  { minLen=clen;
			  }
			  sum=sum-a[start];
			  start++;
		   }
	 }
	 int result=(minLen==Integer.MAX_VALUE)?0:minLen; 	
	 System.out.println(result);
	}
}


