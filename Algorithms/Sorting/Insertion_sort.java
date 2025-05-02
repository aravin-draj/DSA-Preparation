package sorting;

import java.util.Scanner;

import java.util.Arrays;

public class Insertion_sort {

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
		
		for(int i=1;i<N;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}
}
