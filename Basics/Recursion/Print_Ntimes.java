package recursion;

public class Print_Ntimes {
	static void Print_Name(int n) {
		System.out.println("My name is Aravindraj");
		n--;
		if(n>0) {
			Print_Name(n);
		}
		else {
			return;
		}
	}

	public static void main(String[] args) {
		int N=2;
		Print_Name(N);
	}

}
