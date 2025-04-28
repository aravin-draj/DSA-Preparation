package basic_math;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int N=sc.nextInt();
		int res=0;
		int copy=N;
		while(N>0) {
			res+=(N%10)*(N%10)*(N%10);
			N/=10;
		}
		System.out.println(res==copy);

	}

}
