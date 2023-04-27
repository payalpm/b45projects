package tnsif.b45.application;

import tnsif.b45.framework.BankFactory;
import tnsif.b45.framework.CurrentAcc;
import tnsif.b45.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal) {
		SavingAcc sa=new SavingAcc(accno, accname, accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal) {
		CurrentAcc ca=new CurrentAcc(accno, accname, accBal);
		return ca;
	}
	
}
