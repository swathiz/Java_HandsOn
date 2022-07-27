package datastructures;

import java.util.ArrayList;

class Subseq{
	
	static int siz(int arr[], int n)
	{
	 	int lis[] = new int[n];
		int i, j, max = 0;
		
		for (i = 0; i < n; i++)
		{
			lis[i] = 1;
			//System.out.println(lis[i]);
		}
		
		for (i = 1; i < n; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
					
				}
			}	
		}
		
//		for (i = 0; i < n; i++) {
//			System.out.println(lis[i]);
//		}
	
		//System.out.println(l);
		
		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[])
	{
		int arr[] = { 5,10,2,19,45,34,90};
		int n = arr.length;
		System.out.println("Length of lis is " + siz(arr, n) + "\n");
	}
}
