package basic_math;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int N=sc.nextInt();
		int count=0;
		
		for(int i=1;i*i<=N;i++) {
			if(N%i==0) {
				count++;
				if((N/i)!=i){
					count++;
				}
			}
			
			if(count>2) {
				System.out.println("Not a Prime");
				break;
			}
		}
		if(count==2) {
			System.out.println("Prime");
		}

	}

}
