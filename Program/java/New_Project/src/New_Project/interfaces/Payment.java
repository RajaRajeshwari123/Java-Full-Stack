package New_Project.interfaces;

public interface Payment {
	public int getPayment();
	public default void displayInfo() {
		System.out.println("I am displayInfo mathod inside abstract class Payment");
	}

}
