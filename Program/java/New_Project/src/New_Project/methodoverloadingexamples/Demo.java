package New_Project.methodoverloadingexamples;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts savingAccount=new Accounts();
		savingAccount.setAccountNumber(1254334454);
		savingAccount.setAccountType("Gold");
		savingAccount.setBalance(314224.89);
		Double bal=savingAccount.balanceAfterWithdrawal(234567.98);
		System.out.println(bal);
		System.out.println(savingAccount.balanceAfterWithdrawal(bal,"Silver"));
		

	}

}
