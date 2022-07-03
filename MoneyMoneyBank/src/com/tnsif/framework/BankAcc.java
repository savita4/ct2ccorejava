package com.tnsif.framework;

abstract  class BankAcc {
private int accNo;
private String accNm;
private float accBal;


 public  void withdraw(float w)
 {
 
 
 }
 
 
public  void deposit(float d)
{
}


public BankAcc(int accNo, String accNm, float accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}
@Override
public String toString() {
	return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
}




}
