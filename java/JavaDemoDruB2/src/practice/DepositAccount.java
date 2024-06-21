package practice;

public class DepositAccount extends BankAccount{
	
	public int withdrawalLimit;
	
	@Override
	public double interestCalculation() {
		return 6;
	}

}
