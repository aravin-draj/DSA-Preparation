package sorting;

import java.util.Scanner;

import java.util.Arrays;

public class Quick_sort {
	static void quick_sort(int[] arr,int low,int high){
		if(low>=high) {
			return;
		}
		int partition=place_pivot(arr,low,high);
		quick_sort(arr,low,partition-1);
		quick_sort(arr,partition+1,high);
	}
	static int place_pivot(int[] arr,int low,int high) {
		int pivot=low;
		while(low<high) {
			while( low<=high&& arr[low]<=arr[pivot]) {
				low++;
			}
			while( high>=low&& arr[high]>arr[pivot]) {
				high--;
			}
			
			if(low<high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
			}
		}
		int temp=arr[pivot];
		arr[pivot]=arr[high];
		arr[high]=temp;
		return high;
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
		
		quick_sort(arr,0,N-1);
		System.out.println(Arrays.toString(arr));

	}

}
