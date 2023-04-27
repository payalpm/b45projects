package tnsif.b45.framework;

import tnsif.b45.framework.CurrentAcc;
import tnsif.b45.framework.SavingAcc;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal);
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal);

}
