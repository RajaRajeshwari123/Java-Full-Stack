package classworkdayfive.exceptions;

public class Demo {
	public static void main(String args[]) {
//		System.out.println(args);
//		int a=0;
//		try {
//			
//		int b=10/a;
//		System.out.println("b ="+b);
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("Division by zero not allowed");
//		}
//		System.out.println("Hello Exception");
//		}
//		for(int i=0;i<=args.length;i++) {
//			System.out.println(args[i]);
//			}
		
		try {
			int i= Integer.parseInt(args[0]);
			System.out.println(i);
		}
		
		catch(RuntimeException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		
	}
}


