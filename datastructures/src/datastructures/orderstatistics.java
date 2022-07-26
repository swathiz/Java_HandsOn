package datastructures;

import java.util.Scanner;

public class orderstatistics {
	static int smallest(int[] arr, int n, int k) {
		// Initialize the max Element as 0
		int max = 0;

		// Iterate array to find the max element in it
		for (int i = 0; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		// Frequency array to store the frequencies
		int[] counter = new int[max + 1];

		// Counter variable
		int smallest = 0;

		// Counting the frequencies
		for (int i = 0; i < n; i++) {
			counter[arr[i]]++;
		}
		// Iterate through the freq[]
		for (int num = 1; num <= max; num++) {
			// Check if num is present in the array
			if (counter[num] > 0) {
				// Increment the counter with the frequency of num
				smallest += counter[num];
			}
			// Checking if we have reached the Kth smallest element
			if (smallest >= k) {
				// Return the Kth smallest element
				return num;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int[] array = new int[10];

		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}
		int K = 4;// To find the 4th smallest element in the array
		System.out.println(smallest(array, n, K));

	}

}
