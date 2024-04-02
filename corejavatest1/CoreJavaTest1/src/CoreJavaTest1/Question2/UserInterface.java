package CoreJavaTest1.Question2;

import java.util.Scanner;

public class UserInterface {
	private final Scanner sc;

	public UserInterface() {
		this.sc = new Scanner(System.in);
	}

	public void start() {
		System.out.println("Welcome to Telecom Billing System!");

		boolean exitRequest = false;
		while (!exitRequest) {
			displayMenu();
			int choice = getUserChoice();

			switch (choice) {
			case 1:
				System.out.println("Displaying call details...");
				break;
			case 2:
				System.out.println("Generating Invoice");
				break;
			case 3:
				System.out.println("Exiting the system. Thank you!");
				exitRequest = true;
				break;
			default:
				System.out.println("Please select a valid option.");
			}
		}
	}

	private void displayMenu() {
		System.out.println("\nMenu:");
		System.out.println("1. View call details");
		System.out.println("2. Generate invoices");
		System.out.println("3. Exit");
	}

	private int getUserChoice() {
		System.out.print("Enter your choice (1-3): ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
		userInterface.start();
	}
}