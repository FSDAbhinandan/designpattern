package Adapter;

import Adapter.ThirdPartyApi.ICICIAPI;

public class IciciBankAdapter implements BankAPI{
    private ICICIAPI iciciapi = new ICICIAPI();
    @Override
    public double getMoney(int acc) {
        iciciapi.showBalance(acc);
        return 0;
    }

    @Override
    public boolean sendMoney(int from, int to, int amount) {
        iciciapi.sendMoney(from, to, amount);
        return true;
    }

}
