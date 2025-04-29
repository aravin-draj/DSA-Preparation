package recursion;

public class N_sum {
	static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
	
	static void sum1(int n,int sum) {
		if(n<1) {
			System.out.print(sum);
			return;
		}
		sum1(n-1,sum+n);
	}

	public static void main(String[] args) {
		int N=3;
		System.out.println(sum(N));
		sum1(3,0);

	}

}
