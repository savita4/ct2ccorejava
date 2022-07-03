package com.tnsif.application;
 import com.tnsif.framework.*;


public class MMCurrentAcc extends CurrentAcc {


public MMCurrentAcc(int accNo, String accName, float accBalance, float creditLimit) {
	super(accNo, accName, accBalance, creditLimit);
}

public void withdraw(float w)
{
	
}

@Override
public String toString() {
	return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}




}
