package com.tnsif.framework;

 abstract class CurrentAcc  extends BankAcc{
	private float creditLimit;
	public void withdraw(float w)
	{
		
	}

	public CurrentAcc(int accNo, String accName, float accBalance, float creditLimit) {
		super(accNo, accName, accBalance);
		this.creditLimit = creditLimit;
	}

	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
