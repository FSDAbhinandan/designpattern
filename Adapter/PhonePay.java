package Adapter;

import Adapter.BankAPI;

public class PhonePay {
    private BankAPI bankAPI;

    public PhonePay(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void getBalance(int acc){
        bankAPI.getMoney(acc);
    }
    public void sendMoney(int from , int to, int amount){
        bankAPI.sendMoney(from, to, amount);
    }
}
