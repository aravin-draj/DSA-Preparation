package recursion;

public class N_factorial {
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		int N=4;
		System.out.println(fact(N));

	}

}
