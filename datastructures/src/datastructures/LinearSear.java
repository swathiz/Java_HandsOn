package datastructures;

import java.util.Scanner;

public class LinearSear {
	   public static void main(String args[]){
	      String array[] = {"a","l","s","v","n"};
	      int size = array.length;
	      System.out.println("Enter the character you wnat to search:");
	      Scanner scanner = new Scanner(System.in);
		String ser = scanner.next();
		
		for(String s: array) {
			if(s.equals(ser)){
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		
		}


	   }
	}
