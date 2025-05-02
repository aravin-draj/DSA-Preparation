package sorting;

import java.util.Scanner;

import java.util.Arrays;

public class Recursive_Insertion_sort {
	static void insertion_sort(int arr[],int N,int current,int i) {
		if(current==N) {
			return;
		}
		if(i==0) {
			insertion_sort(arr,N,current+1,current+1);
		}
		else {
			if(arr[i-1]>=arr[i]) {
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
				insertion_sort(arr,N,current,i-1);
			}
			else {
				insertion_sort(arr,N,current+1,current+1);
			}
			
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
		insertion_sort(arr,N,1,1);
		System.out.println(Arrays.toString(arr));

	}

}
