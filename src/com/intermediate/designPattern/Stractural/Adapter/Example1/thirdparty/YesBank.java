package com.intermediate.designPattern.Stractural.Adapter.Example1.thirdparty;

public class YesBank {
    public double checkBalance(String accNumber) {
        return 1000;
    }

    public boolean sendMoney(String fromAcc, String toAcc, double x) {
        return true;
    }
}
