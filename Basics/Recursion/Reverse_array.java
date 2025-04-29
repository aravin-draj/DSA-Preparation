package recursion;
import java.util.Scanner;
import java.util.Arrays;

public class Reverse_array {
	static void reverse1(int[] arr,int i,int j) { //two pointer recursion
		if(i>=j) {
			return;
		}
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
		reverse1(arr,i+1,j-1);
		
	}
	
	static void reverse2(int[] arr,int i,int n) {
		if(i>=n/2) {
			return;
		}
		arr[i]=arr[i]+arr[n-i-1];
		arr[n-i-1]=arr[i]-arr[n-i-1];
		arr[i]=arr[i]-arr[n-i-1];
		reverse2(arr,i+1,n);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements : ");
		String input=sc.nextLine();
		String[] nums=input.split(" ");
		int N=nums.length;
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(nums[i]);
		}
		reverse1(arr,0,N-1);
		System.out.println(Arrays.toString(arr));
		reverse2(arr,0,N);
		System.out.println(Arrays.toString(arr));
	}

}
