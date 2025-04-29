package recursion;

public class PrintN_Backtracking {
	static void PrintN(int i,int N) {
		if(i<1) {
			return;
		}
		PrintN(i-1,N);
		System.out.println(i);
	}

	public static void main(String[] args) {
		int N=10;
		PrintN(N,N);

	}

}
