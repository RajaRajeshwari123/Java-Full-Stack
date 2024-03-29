package New_Project.multipleinheritance;

public interface Payment {
public int getPayment();//abstract method without body
	
	//Default method in interface introduced in Java 8
	public default void displayInfo() {
		System.out.println("I am displayInfo which is a default method inside Payment interface");
	}
	
	//Static method in interface is introduced in Java 8
	public static void displayInformation() {
		System.out.println("I am displayInformation  which is a static method inside abstract class Payment");
	}


}
