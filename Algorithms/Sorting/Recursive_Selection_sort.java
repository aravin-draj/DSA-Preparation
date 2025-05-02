package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive_Selection_sort {
	static void selection_sort(int[] arr,int start,int i,int N,int min) {
		if(start==N-1) {
			return;
		}
		if(i==N) {
			int temp=arr[start];
			arr[start]=arr[min];
			arr[min]=temp;
			selection_sort(arr,start+1,start+1,N,start+1);
		}
		else {
			if(arr[i]<arr[min]) {
				min=i;
			}
			selection_sort(arr,start,i+1,N,min);
		}
	}

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
		selection_sort(arr,0,0,N,0);
		System.out.println(Arrays.toString(arr));
		

	}

}
