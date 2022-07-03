package com.tnsif.framework;

abstract class SavingAcc extends BankAcc  {
private boolean isSalaried;
	
	private float minBal;
	@Override
	public void withdraw(float w)
	{
		
	}
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float minBal) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
		this.minBal = minBal;
	}


	@Override
	public String toString() {
		return "BankFactory [isSalaried=" + isSalaried + ", minBal=" + minBal + "]";
	}
	
	
	
	
	
	

}
