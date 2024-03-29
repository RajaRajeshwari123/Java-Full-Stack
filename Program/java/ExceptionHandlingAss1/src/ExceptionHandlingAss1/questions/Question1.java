package ExceptionHandlingAss1.questions;

import java.util.Scanner;

public class Question1 {
	 
	public static void main(String[] args) {
		int[] count = new int[26];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a single word : ");
		String word = scan.nextLine();
		word = word.toUpperCase();
		
		try {
		for(int i=0; i<word.length(); i++)
		{
			count[word.charAt(i) - 'A']++;
		}
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Not a letter.\nexception encountered : "+e);
		}
		for(int i=0; i<count.length; i++)
		{
				if(count[i] != 0)
					System.out.println((char)(i+'A') + ": " + count[i]);
		}
		scan.close();
	}
}