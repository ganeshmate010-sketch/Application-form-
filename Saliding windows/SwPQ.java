//1,3,2,6,-1,4,1,8,2}; 


import java.util.Scanner;
public class SwPQ{
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
		//3
		int sum = 0;
		
		//6
		for(int i=0; i<k; i++){
			sum = sum + a[i];
		}
		System.out.println("Sum: "+sum);
		
		//3 -3 = 0 // a[0] = 1 
		for(int i=k; i<n; i++){
			sum = sum + a[i] - a[i-k];
			
			System.out.println("Sum: "+sum);
		}
	}
}