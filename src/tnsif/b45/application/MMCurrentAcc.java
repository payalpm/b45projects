package tnsif.b45.application;

import tnsif.b45.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float accBal) {
		super(accno, accname, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("You have withdraw the amount with creditlimit"
	                        + accBal +" along with crediteLimit" 
				           + creditLimit);
		
	}

}
