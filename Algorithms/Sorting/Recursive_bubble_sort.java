package sorting;

import java.util.Scanner;

import java.util.Arrays;

public class Recursive_bubble_sort {
	
	static void Bubble_sort(int[] arr,int n,int i) {
		if(n==1) {
			return;
		}
		if(i>=n-1) {
			Bubble_sort(arr,n-1,0);
		}
		else {
			if(arr[i]>arr[i+1]) {
			int temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
			}
			Bubble_sort(arr,n,i+1);
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
		Bubble_sort(arr,N,0);
		System.out.println(Arrays.toString(arr));
		
	}

}
