package recursion;
import java.util.Scanner;

public class Palindrome_str {
	static boolean check_Palindrome(int i,String str,int n) {
		if(i>=n/2) {
			return true;
		}
		if(str.charAt(i)!=str.charAt(n-i-1)) {
			return false;
		}
		return check_Palindrome(i+1,str,n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=sc.next();
		int N=str.length();
		
		System.out.println(check_Palindrome(0,str,N));

	}

}
