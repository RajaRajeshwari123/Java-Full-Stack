package New_Project.superexample;

public class Demo {
	public static void main(String[] args) {
		System.out.println(" [Main function Begins----------------------] ");
		System.out.println(" Creating an object for manager class ");
		
		Manager mm = new Manager(10,"Gandhi","Banking");
		
		System.out.println(" Printint the manager details .... : ");
		mm.display();
	    System.out.println(" [Main function Ends----------------------] ");
		}

}
