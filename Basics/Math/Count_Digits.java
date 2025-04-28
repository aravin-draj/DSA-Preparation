package basic_math;
import java.util.Scanner;
public class Count_Digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter N : ");
		int N=sc.nextInt();
			int count=0;
			while(N>0) {
				N/=10;
				count++;
			}
		System.out.println(count);
	}
}
