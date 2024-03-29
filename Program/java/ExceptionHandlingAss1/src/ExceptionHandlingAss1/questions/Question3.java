package ExceptionHandlingAss1.questions;

import java.util.Scanner;

public class Question3 {
	public static void main(String args[]) {
		String keepGoing="y";
		Scanner sc=new Scanner(System.in);
		
		while(keepGoing.equals("y") || keepGoing.equals("y")) {
			try {
				System.out.println("Enter an Integer:");
				int val =sc.nextInt();
				System.out.println("Factorial("+ val +")=" + Question3_1.factorial(val));
				System.out.println("Another factorial? (y/n)");
				keepGoing=sc.next();
			}catch(IllegalArgumentException e) {
				System.out.println("Invalid input. Enter a non-negative integer.");
				
			}
		}
	}

}
