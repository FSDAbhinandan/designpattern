package com.intermediate.designPattern.Stractural.Adapter.Example1;

import com.intermediate.designPattern.Stractural.Adapter.Example1.thirdparty.ICICIBank;

public class ICICIBankApiAdapter implements BankApi {
	
	ICICIBank ib = new ICICIBank();

	@Override
	public double getBalance(String accountNumber) {
		// TODO Auto-generated method stub
		return ib.checkBalance(accountNumber);
	}

	@Override
	public boolean sendMoney(String fromAccount, String toAccount, double amount) {
		// TODO Auto-generated method stub
		return ib.sendMoney(fromAccount, toAccount, amount);
	}

}
