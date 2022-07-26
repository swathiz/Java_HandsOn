package datastructures;

public class sumrange {
	
	public static void sum(int l, int r, int a[]) {
		
		int s = 0;
		for(int i = l;i<=r;i++) {
			s+= a[i];
		}
		
		System.out.println("sum is:"+s);
		
	}

	public static void main(String[] args) {
		
		int[] array = {3,7,2,5,8,9};
		sum(1, 4,array);
	}

}
