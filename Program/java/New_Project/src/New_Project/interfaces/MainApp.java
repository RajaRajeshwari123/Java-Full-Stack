package New_Project.interfaces;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment netBanking=new PaymentByNetBanking();
		Payment CreditCard=new PaymentByCreditCard();
		
		netBanking.displayInfo();
		System.out.println(netBanking.getPayment());
		Payment.displayInformation();
		
		System.out.println("*************************************");
		creditCard.displayInfo();
		System.out.println(creditCard.getPayment());
		

	}

}
