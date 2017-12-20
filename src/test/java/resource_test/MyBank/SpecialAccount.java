package resource_test.MyBank;

import resource_test.MyBank.exception.NegativeAmountException;

public class SpecialAccount extends OrdinaryAccount {

	private double bonus;

	public SpecialAccount(String number) {
		super(number);
		bonus = 0;
	}

	public void earnBonus() {
		try {
			super.credit(bonus);
		} catch (NegativeAmountException nae) {
			nae.printStackTrace();
		} finally {
			bonus = 0;
		}
	}

	public double getBonus() {
		return bonus;
	}

	public void credit(double amount) throws NegativeAmountException {
		this.bonus += amount * 0.01;
		super.credit(amount + this.bonus);
	} //metodo todo errado!! antes era super.credit(amount) e this.bonus += (amount * 0.01) nessa ordem
}
