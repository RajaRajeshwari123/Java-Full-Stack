package New_Project.interfaces;

public class PaymentByNetBanking implements Payment{

	@Override
	public int getPayment() {
		System.out.println("Payment is done through net banking");
		return 1000;
	}
}
