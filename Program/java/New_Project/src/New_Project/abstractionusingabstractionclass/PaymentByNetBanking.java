package New_Project.abstractionusingabstractionclass;

public class PaymentByNetBanking extends Payment {
	public int getPayment() {
		System.out.println("Payment is Done...Through Credit Card");
		return(1000*2);
		
	}  
}

