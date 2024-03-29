package New_Project.stringexamples;

public class StringAnotherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//03451627818363531789
		String helloworld="Hello World !!";
		System.out.println(helloworld.length());
		System.out.println(helloworld.charAt(10));
		System.out.println(helloworld.indexOf('H'));
		System.out.println("************************");
		for(int index=0;index<helloworld.length();index++) {
			if(helloworld.charAt(index)=='l'){
				System.out.println(index);
				
			}
		}
		System.out.println("**************************************");
		String newString=helloworld.concat("\\n world is very beautiful!!!");
		System.out.println(helloworld);
		System.out.println(helloworld.hashCode());
		System.out.println(newString);
		System.out.println(newString.hashCode());
		
		System.out.println("***************************************");
		String upperCase=helloworld.toUpperCase();
		System.out.println(upperCase);
		String lowerCase=helloworld.toLowerCase();
		System.out.println(lowerCase);
		char [] arrayOfChar=helloworld.toCharArray();
		System.out.println(arrayOfChar);
		System.out.println(arrayOfChar[7]);
		
		System.out.println("***************************************");
		String month="January";
		System.out.println(month.startsWith("Jan"));
		System.out.println(month.endsWith("ry"));
		
		System.out.println("***************************************");
		System.out.println(month.substring(2));
		System.out.println(month.substring(2,5));
		
		System.out.println("***************************************");
		System.out.println(month.equals("January"));
		System.out.println(month.equalsIgnoreCase("January"));
		
		System.out.println("***************************************");
		if(month=="January") {
			System.out.println("Both are Same.");
		}else if(month=="january") {
			System.out.println("Both are Different.");
		}else {
			System.out.println("I didn't know anything about it!");
		}
		System.out.println("***************************************");
		String january=new String("January");
		System.out.println((january==month));//compares memory address
		System.out.println(january.equals(month));// compares contact

		
		

	}

}
