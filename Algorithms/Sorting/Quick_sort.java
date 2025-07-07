package sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Quick_sort {

    static void quick_sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int partition = place_pivot(arr, low, high);
        quick_sort(arr, low, partition - 1);
        quick_sort(arr, partition + 1, high);
    }

    static int place_pivot(int[] arr, int low, int high) {
        int pivotValue = arr[low]; // store pivot value (not index)
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivotValue) {
                i++;
            }
            while (i <= j && arr[j] > pivotValue) {
                j--;
            }

            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot value at its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // return the correct pivot index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");
        String line = sc.nextLine();
        String[] nums = line.trim().split("\\s+");
        int N = nums.length;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        quick_sort(arr, 0, N - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
