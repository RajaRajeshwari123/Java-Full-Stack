package New_Project.methodoverridingexample;

public class Demo {
	public static void main(String []args) {
		Dad dad=new Dad(); //object of dad class
		Kid kid=new Kid();// kid class object
		
		dad.display();
		kid.display();
		
		
		Dad kids=new Kid();
		kids.display();
//		Kid dads=new Dad();
//		dads.diplay();
	}

}
