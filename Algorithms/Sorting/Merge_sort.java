package sorting;

import java.util.Scanner;

import java.util.Arrays;

public class Merge_sort {
	static void merge_sort(int[] arr,int low,int high) {
		if(low==high) {
			return;
		}
		int mid=(low+high)/2;
		merge_sort(arr,low,mid);
		merge_sort(arr,mid+1,high);
		merge(arr,low,mid,high);
				
	}
	static void merge(int[] arr,int low,int mid,int high) {
		int l=low;
		int r=mid+1;
		int[] temp=new int[high-low+1];
		int i=0;
		while(l<=mid && r<=high) {
			if(arr[l]<=arr[r]) {
				temp[i]=arr[l];
				l++;
			}
			else {
				temp[i]=arr[r];
				r++;
			}
			i++;
		}
		if(l<=mid) {
			while(l<=mid) {
				temp[i]=arr[l];
				l++;
				i++;
			}
		}
		else {
			while(r<=high) {
				temp[i]=arr[r];
				r++;
				i++;
			}
		}
		System.out.println(Arrays.toString(temp));
		for(int j=low;j<=high;j++) {
			arr[j]=temp[j-low];
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
		merge_sort(arr,0,N-1);
		
		
		
		

	}

}
