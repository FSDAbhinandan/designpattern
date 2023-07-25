package com.intermediate.designPattern.Stractural.Adapter.Example1;

import com.intermediate.designPattern.Stractural.Adapter.Example1.thirdparty.YesBank;

public class YesBankAPIAdapter implements BankApi {
	
	YesBank yb = new YesBank();

	@Override
	public double getBalance(String accountNumber) {
		// TODO Auto-generated method stub
		return yb.checkBalance(accountNumber);
	}

	@Override
	public boolean sendMoney(String fromAccount, String toAccount, double amount) {
		// TODO Auto-generated method stub
		return yb.sendMoney(fromAccount, toAccount, amount);
	}

}
