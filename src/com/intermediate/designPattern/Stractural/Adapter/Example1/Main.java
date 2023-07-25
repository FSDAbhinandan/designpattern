package com.intermediate.designPattern.Stractural.Adapter.Example1;

public class Main {
	public static void main(String[] args) {
		PhonePay pp = new PhonePay(new YesBankAPIAdapter());
		System.out.println(pp.ba.getBalance("assd")+ " "+ pp.ba.sendMoney("", "", 0));
	}
	
}
