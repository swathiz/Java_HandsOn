package calculator;

import java.util.Scanner;

public class ArithematicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char opr;
		Double num1,num2,res = null;
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
		
		
		System.out.println("Enter value for first number");
		num1 = in.nextDouble();
		
		System.out.println("Enter value the second number");
		num2 = in.nextDouble();
		
		System.out.println("Choose your operation: \n 1.'+' \n 2.'-' \n 3.'*' \n 4.'\\' \n 5.'%' ");
		opr = in.next().charAt(0);
		
		switch(opr) {
		
		case '+':
			res = num1+num2; 
			System.out.println(num1 + "+" + num2 + "="+ res);
			break;
		case '-':
			res = num1-num2; 
			System.out.println(num1 + "-" + num2 + "="+ res);
			break;
		case '*':
			res = num1*num2; 
			System.out.println(num1 + "*" + num2 + "="+ res);
			break;
		case '/':
			res = num1/num2; 
			System.out.println(num1 + "/" + num2 + "="+ res);
			break;
		case '%':
			res = num1%num2;
			System.out.println(num1 + "%" + num2 + "="+ res);
			 break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		
		//System.out.println("Result is:" + num1 + " " + opr + " " + num2 + " = " + res);
		System.out.println();
		}

	}

}


