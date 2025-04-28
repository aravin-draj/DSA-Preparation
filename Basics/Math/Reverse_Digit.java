package basic_math;

import java.util.Scanner;

public class Reverse_Digit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int N=sc.nextInt();
		
		int res=0;
		while(N>0) {
			res=res*10+(N%10);
			N/=10;
		}
		System.out.println(res);
	}

}
