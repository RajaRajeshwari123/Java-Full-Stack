package CorejavaExercises.ass1;

import java.util.Scanner;

//import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		System.out.println("Enter First value: ");
//		int num1 = a.nextInt();
//		Scanner b = new Scanner(System.in);
//		System.out.println("Enter Second value: ");
//		int num2 = a.nextInt();
//		int res = num1 + num2;
//		System.out.println("Sum of Integer:" + res);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your age:");
//		int age=sc.nextInt();
//		if(age<18) {
//			System.out.println("Your Not Eligible");
//		}
//		else {
//			System.out.println("Your Eligible");
//		}
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter integers: ");
//		int a = scanner.nextInt();	
//		
//		if (a%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("Odd");
//		}
	
//		int a=10;
//		float f=34f;
//		int a=(int)f;
//		int a=10;
//		byte b=(byte)a;
//		
//		System.out.println(a);
//		System.out.println(b);
		//operators in java
//		int x=10;
//		int y=20;
//		System.out.println(x++ + ++x);
//		System.out.println(x-- + --x);
//		System.out.println(++x - x++);
//		System.out.println(--x + --x);
//		
//	}
//	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter first num1 :");
//		int num1=sc.nextInt();
//		System.out.println("Ener second number :");
//		int num2=sc.nextInt();
//		int res=num1+num2;
//		if(num1+num2>20) {
//			System.out.println("greater numbers:"+res);
//		}
//		int res=num1/num2;
//		System.out.println("Result:"+res);
//		System.out.println(10*10/8+4-9%2);
//		int x = 10;    
//		int y = 12;    
//		if(x+y <20) {    
//		System.out.println("x + y is greater than 20");   
//		
//		}
//		else {
//			System.out.println("lessthen");
////		}
//		String city = null;  
//		if(city == "Meerut") {  
//		System.out.println("city is meerut");  
//		}
////		
////		else if(city == "Agra") {  
////		System.out.println("city is agra");  
////		}
//		else {  
//		System.out.println(city);  
//		}  
//		int num=3;
//		switch(num) {
//		case 0:
//			System.out.println("fsuduyidu");
////			break;
//		case 1:
//			System.out.println("yui");
//			break;
//			default:
//			System.out.println(num);
//		}
//		int num=200;
//		for(int i=0;i>num;i++) {
//			num=num+i;
//			
//		}
//		System.out.println("fduykdgk");
//		
//		
//		int i = 12;    
//		System.out.println("Printing the list of first 10 even numbers :\n");    
//		do {    
//		System.out.print(" "+i);    
//		i = i + 2;    
//		}    while(i<=100); 
//		a:
//			
//		for(int a = 1; a<= 100; a++) { 
//			b:
//				for(int b = 1; b<= 100; b++) { 	
//			System.out.print(" "+b);  
//			if(b==100) {  
//				System.out.println();
//			break;  
//			
//			}  }}
//		for(int i = 0; i<= 10; i++) {  
//			  
//			for (int j = i; j<=100;++j) {  
//			  
//			if(j == 4) {  
//			continue;  
//			}  
//			System.out.print(j);  
//			}  
//			}  
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the year: ");
//		int num=sc.nextInt();
//		if(num % 4 !=0) {
//			System.out.println("leep year");
//		}
//		else {
//			System.out.println("not a leep year");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
//		int marks=sc.nextInt();
//		if(marks<50) {
//			System.out.println("Fail");
//		}
//		else if(marks<=50 && marks>60) {
//			System.out.println("Grade D");
//		}
//		else if(marks<=60 && marks>70) {
//			System.out.println("Grade D");
//		}
//		else if(marks<=70 && marks>80) {
//			System.out.println("Grade D");
//		}
//		else if(marks<=80 && marks>90) {
//			System.out.println("Grade D");
//		}
//		else if(marks<=90 && marks>100) {
//			System.out.println("Grade D");
//		}else {
//		System.out.println("Invaild");
//		}}
		
		String a=sc.nextLine();
		System.out.println("Enter student roll.no: ");
		int b=sc.nextInt();
		
		System.out.println("Enter Subject 1 marks: ");
		float c=sc.nextFloat();
		System.out.println("Enter Subject 2 marks: ");
		float d=sc.nextFloat();
		System.out.println("Enter Subject 3 marks: ");
		float e=sc.nextFloat();
		System.out.println("Enter Subject 4 marks: ");
		float f=sc.nextFloat();
		System.out.println("Enter Subject 5 marks: ");
		float h=sc.nextFloat();
		
		float totalmarks=c+d+e+f+h;
		float parcentage=(totalmarks/500*100);
		System.out.println("Total Marks: "+totalmarks);
		System.out.println("Total percentage: "+parcentage);
		sc.close();
		if(parcentage<50) {
			System.out.println("Fail");
		}else if(totalmarks<=50 && totalmarks>60) {
			System.out.println("Grade D");
		}
		else if(totalmarks<=60 && totalmarks>70) {
			System.out.println("Grade C");
		}
		else if(totalmarks<=70 && totalmarks>80) {
			System.out.println("Grade B");
		}
		else if(totalmarks<=80 && totalmarks>90) {
			System.out.println("Grade A");
		}
		else if(totalmarks<=90 && totalmarks>100) {
			System.out.println("Grade A+");
		}
		else {
				System.out.println("Pass");
			
		}}
		
		
}

