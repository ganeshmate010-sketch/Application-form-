//1,3,2,6,-1,4,1,8,2}; 
//find max 

import java.util.Scanner;
public class FindMaxPQ{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int a [] = new int[n];
		for(int i =0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter k value");
		int k = sc.nextInt();
		int sum = 0;

		for(int i=0; i<k; i++){
			sum = sum + a[i];
		}
		
		int max = sum;
		 
		for(int i=k; i<n; i++){
			sum = sum + a[i] - a[i-k];
			
			if(sum > max){
				max = sum;
			}
		}
		System.out.println("MaxSum: "+max);
	}
}