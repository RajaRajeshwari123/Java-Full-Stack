package New_Project.inheritances;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s1=new A();
		B s2=new B();
//		s1.m=10;
//		s1.n=20;
		s1.setM(10);
		s1.setN(20);
		
		 
		System.out.println("State of object A:");
		s1.display();
		s2.setM(7);
		s2.setN(8);
		s2.setC(9);

	}

}
