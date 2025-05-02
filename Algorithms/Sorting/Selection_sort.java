package sorting;
import java.util.Scanner;
import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array elements : ");
		String line=sc.nextLine();
		String[] nums=line.split(" ");
		int N=nums.length;
		int[] arr =new int[N];	
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(nums[i]);
		}
		
		for(int i=0;i<=N-2;i++) {
			int min=i;
			for(int j=i;j<=N-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(i!=min) {
			arr[i]=arr[i]+arr[min];
			arr[min]=arr[i]-arr[min];
			arr[i]=arr[i]-arr[min];
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
