package New_Project.abstractionusingabstractionclass;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("********Get Payment********");
		System.out.println("********Select Payment Option");
		System.out.println("1. Net Banking");
		System.out.println("2. Credit Card");
		System.out.println("3. Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			PaymentByNetBanking netBanking = new PaymentByNetBanking();
			netBanking.displayInfo();
			System.out.println(netBanking.getPayment());
		}else if(choice ==2) {
			PaymentByCreditCard creditCard = new PaymentByCreditCard();
			creditCard.displayInfo();
			System.out.println(creditCard.getPayment());
		}else {
			System.out.println("Ta Ta Bye Bye !!!");
		}
		

	}



}
