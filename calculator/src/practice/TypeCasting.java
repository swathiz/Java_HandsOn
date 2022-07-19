package practice;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//From smaller to larger type(in bytes) it happens to be implict conversion
		System.out.println("Implicit Type Casting");
		
		byte x = 'A';
		System.out.println("value of x:" + x);
		
		int a = 'A';
		System.out.println("value of a:" + a);
		
		float b = 'A';
		System.out.println("value of b:" + b);
		
		double c = 'A';
		System.out.println("value of c:" + c);
		
		long d = 'A';
		System.out.println("value of d:" + d);
		
		char n = 69;
		System.out.println("value of  n:" + n);
		
		char myunichar = '\u0044';
		System.out.println("unichar:"+myunichar+"\n");
		
		System.out.println("Explict Type Casting \n");
		
		float l = 78.9f;
		int m = (int) l;
		System.out.println("value of m:"+m);
		//As we are converting it to int it removed the decimal value and printing the 
		//m value
		
		
		
		
		
	}

}
