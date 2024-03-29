package classworkdayfive.exceptions;

import java.math.BigDecimal;

public class WrapperClassDemo {

	public static void main(String args[]) {
		//primitive data types
		int num=15;
		double salary=155.50;
		char letter ='A';
		float floatNumber=134.50f;
		
		//wrapper class --- auto boxing
		Integer intNum=num;
		Double dSal=salary;
		Character cLetter=letter;
		Float fFloatNum=floatNumber;
		BigDecimal bigDecimal=new BigDecimal(12345.098765434565489234567);
		
		System.out.println(intNum instanceof Integer);
		System.out.println(dSal instanceof Double);
		System.out.println(cLetter instanceof Character);
		System.out.println(fFloatNum instanceof Float);
		System.out.println(bigDecimal instanceof BigDecimal);
	
		//Auto unboxing
		System.out.println(intNum.intValue());//int value is a method
		System.out.println(dSal.doubleValue());
		System.out.println(cLetter.charValue());
		System.out.println(fFloatNum.floatValue());
//		System.out.println(bigDecimal.bigDecimalValue());
		
		String doubleVal="234567.876";
		double dVal=Double.parseDouble(doubleVal);
		System.out.println(dVal);
		
		String intVal="234567.876";
		double iVal=Double.parseDouble(doubleVal);
		System.out.println(iVal);
		
	}
}
