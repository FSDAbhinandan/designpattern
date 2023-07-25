package com.intermediate.designPattern.Stractural.Adapter.Example1.thirdparty;

public class ICICIBank {
    public double checkBalance(String accNumber) {
        return 2000;
    }

    public boolean sendMoney(String fromAcc, String toAcc, double x) {
        return true;
    }
}
