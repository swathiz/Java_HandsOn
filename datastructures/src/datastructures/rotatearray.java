package datastructures;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class rotatearray {

	static void RightRotate(int a[], int n, int k) {

		// If rotation is greater than size of array
		k = k % n;

		for (int i = 0; i < n; i++) {
			if (i < k) {
				// Printing rightmost kth elements
				System.out.print(a[n + i - k] + " ");
			} else {
				// Prints array after'k' elements
				System.out.print(a[i - k] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int[] array = new int[10];
		//int N = array.length;
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.nextInt();
		}
		int K = 5;// To rotate 5 times
		RightRotate(array, n, K);
	}
}
