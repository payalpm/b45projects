package tnsif.b45;

import tnsif.b45.application.MMBankFactory;
import tnsif.b45.application.MMCurrentAcc;
import tnsif.b45.framework.BankFactory;
import tnsif.b45.framework.CurrentAcc;
import tnsif.b45.framework.SavingAcc;
import tnsif.b45.application.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123, "Harshitha", 10000);
		sa.withdraw(5000);
		CurrentAcc ca=new MMCurrentAcc(1234, "Ganavi", 0);
		ca.withdraw(5000);
		

	}

}
