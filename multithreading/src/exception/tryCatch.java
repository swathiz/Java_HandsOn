package exception;

import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;

		System.out.println("Enter 2 numbers");

		Scanner s = new Scanner(System.in);
	
		try {
			a = s.nextInt();
			b = s.nextInt();
			c = a / b; 
			//In the above line exception occurs so the execution stops at this point and no further lines will be executed
			//so continue the execption without any intrruption we will put try and catch and so further execution continues
			System.out.println(a + "/" + b + "=" + c );
		} catch (ArithmeticException e) {
			System.out.println("OOPS! there is an Exception and the exception is \n"+e);
		}

		System.out.println("to be continued..");

	}

}
