package arrayz;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a array of int type
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);}
		System.out.println();
		//declare and initilize the array
		int ar[] = {4,5,6};
		for(int i = 0;i<ar.length;i++) {
		System.out.println(ar[i]);}
		
		//declare a 2d array
		char[][] arr=new char[2][2];
		arr[0][0] = 'a';
		arr[0][1] = 'b';
		arr[1][0] = 'a';
		arr[1][1] = 'i';
		
		System.out.println();
		for(int i = 0;i<2;i++) {
			for (int j=0;j<2;j++) {
			System.out.print(arr[i][j]+ " ");}
		System.out.println();	
		}
		
		System.out.println();
		
		int br[][]={{1,2,3},{2,4,5},{4,4,5}};  
		
		for(int i = 0;i<3;i++) {
			for (int j=0;j<3;j++) {
			System.out.print(br[i][j]+ " ");}
		System.out.println();	
		}

	}

}
