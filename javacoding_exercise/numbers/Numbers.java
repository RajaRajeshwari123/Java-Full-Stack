package javacoding_exercise.numbers;

import java.util.Scanner;

public class Numbers {
	// prime numbers
	public void checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("it's a Prime Number ");
		} else {
			System.out.println("It's not a Prime Number ");
		}
	}

	public void ArmStrong(int num) {

		int temp = num;
		int r, sum = 0;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println("it's a ArmStrong Number ");
		} else {
			System.out.println("It's not a ArmStrong Number ");
		}
	}

	public void Palindram(int num) {
		int rev = 0, r;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			rev = (rev * 10) + r;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("it's a Palindram Number ");
		} else {
			System.out.println("It's not a Palindram Numbers ");
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		Numbers number = new Numbers();
		int num = sc.nextInt();
//		System.out.println(num+"is Prime: "+number.checkPrime(num));
		number.checkPrime(num);
		number.ArmStrong(num);
		number.Palindram(num);
	}

}
