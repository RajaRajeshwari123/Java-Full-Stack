package New_Project.methodoverloadingexamples;

public class Accounts {
	private Integer accountNumber;
	private Double balance;
	private String accountType;
	
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public Double balanceAfterWithdrawal(Double withdrawAmount) {
		return this.balance-withdrawAmount;
	}
	public Double balanceAfterWithdrawal(Double withdrawAmount,String accountType) {
		if(accountType.equals("Silver")) {
			return this.balance-withdrawAmount-5000;
		}
		return this.balance-withdrawAmount-500000;
	}
	public Integer balanceAfterWithdrawal(Integer withdrawAmount) {
		return withdrawAmount;
	}
}
