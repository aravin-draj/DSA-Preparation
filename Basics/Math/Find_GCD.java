package basic_math;
import java.util.Scanner;

public class Find_GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N1 : ");
		int N1=sc.nextInt();
		System.out.println("Enter N2 : ");
		int N2=sc.nextInt();
		
		while(N1>0 && N2>0) {
			if(N1>N2) {
				N1=N1%N2;
			}
			else {
				N2=N2%N1;
			}
		}
		if(N1==0) {
			System.out.println(N2);
		}
		else {
			System.out.println(N1);
		}
	}

}
