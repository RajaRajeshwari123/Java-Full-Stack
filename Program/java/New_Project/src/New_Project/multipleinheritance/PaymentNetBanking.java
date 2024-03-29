package New_Project.multipleinheritance;

public class PaymentNetBanking  extends GSTRate implements Payment{

	@Override
	public int getPayment() {
		
		return 5000*getGSTRate();
	}

	@Override
	public int getGSTRate() {
		
		return 2;
	}

}
