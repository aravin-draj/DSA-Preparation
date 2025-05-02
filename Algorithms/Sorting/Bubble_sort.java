package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {

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
		
		for(int i=0;i<N-1;i++) {
			int swap=0;
			for(int j=0;j<N-1-i;j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=1;
				}
			}
			if(swap==0) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
