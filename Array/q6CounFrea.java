/* 6. Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times  
Element 5 occurs 2 times  
Element 6 occurs 1 time  
Element 7 occurs 1 time   */
 /* 
 import java.util.*;
 public class q6CounFrea
 {
	 public static void main(String x[])
	 {
		 int a[]={4, 5, 6, 4, 5, 7, 4};
		 int count=a[0];
		 for(int i=0; i<a.length; i++)
		 {
			 for(int j=i+1	; j<a.length; j++)
			 {
				 if(a[i]==a[j])
				 {   
					 System.out.println("array"+a[j]+""+count);
				 }
			 }
		 }
	 }
 } */
 
 
 
 public class q6CounFrea {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 4, 5, 7, 4};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " times");
        }
    }
}
