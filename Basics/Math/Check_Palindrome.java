package basic_math;
import java.util.Scanner;
public class Check_Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter N : ");
		int N=sc.nextInt();
		int copy=N;
		int temp=0;
		while(copy>0) {
			temp=temp*10+(copy%10);
			copy/=10;
		}
		System.out.println(N==temp);

	}

}
