package com.intermediate.designPattern.Stractural.Adapter.Example1;

public interface BankApi {
    double getBalance(String accountNumber);

    boolean sendMoney(String fromAccount,
                      String toAccount,
                      double amount);
}
