package com.tnsif.application;
import com.tnsif.framework.*;

public class MMSavingAcc extends SavingAcc {

	private float MINBAL;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	
	public void withdraw(float w)
	{
		
	}


	@Override
	public String toString() {
		return "MMSavingAcc [MINBAL=" + MINBAL + "]";
	}
	
	
	
	
}
