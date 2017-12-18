package resource_test.MyBank;

import resource_test.MyBank.exception.NegativeAmountException;

public class SavingsAccount extends OrdinaryAccount {

	public SavingsAccount(String number) {
		super(number);
	}

	public void earnInterest() {
		try {
			this.credit(this.getBalance() * 0.001);
		} catch (NegativeAmountException e) {
			e.printStackTrace();
		}
	}
}
