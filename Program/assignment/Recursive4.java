package New_Project.assignment;
import java.util.Scanner;
public class Recursive4 {
	
	 
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your comments here: ");
	    	String input = sc.nextLine();
	 
	        String iteratively = iteratively(input);
	        System.out.println("Reverse Type (Iterative): " + iteratively);
	 
	        String recursively = recursively(input);
	        System.out.println("Reverse Type (Recursive): " + recursively);
	        sc.close();
	    }
	 
		public static String iteratively(String str) {
			char [] x = str.toCharArray();
			int left = 0;
			int right = x.length - 1;
			
			while(left < right) {
				char temp = x[left];
				x[left] = x[right];
				x[right] = temp;
				
				left ++ ;
				right --;
			}
			return new String(x);
	    }
	 
		public static String recursively(String str) {
	        if (str.isEmpty()) {
	            return str;
	        }
	        return recursively(str.substring(1)) + str.charAt(0);
	    }
	}


