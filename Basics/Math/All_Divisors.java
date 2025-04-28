package basic_math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All_Divisors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int N=sc.nextInt();
		List<Integer> L = new ArrayList<>();
		
		for(int i=1;i*i<=N;i++) {
			if(N%i==0) {
				L.add(i);
				if(N/i!=i) {
					L.add(N/i);
				}
			}
			
		}
		L.sort(null);
		System.out.println(L);

	}

}
