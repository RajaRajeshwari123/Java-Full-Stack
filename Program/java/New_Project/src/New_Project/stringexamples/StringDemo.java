package New_Project.stringexamples;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		String s1="Hello";
		String s2=new String("How are you?");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		String s3="Hello";
		System.out.println(s3);
		System.out.println(s3.hashCode());
		System.out.println("***********************************");
		s="world";
		s1="fire fire!!";
		s2="Run leave java programming";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("***********************************");
	}

}
