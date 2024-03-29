package New_Project.abstractionusingabstractionclass;

public class PaymentByCreditCard extends Payment{

	@Override
	public int getPayment() {
		System.out.println("Payment is done through credit card");
		return (1000*2);
	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

}


