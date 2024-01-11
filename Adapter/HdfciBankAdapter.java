package Adapter;

import Adapter.ThirdPartyApi.HDFCAPI;
import Adapter.ThirdPartyApi.ICICIAPI;

public class HdfciBankAdapter implements BankAPI{
    private HDFCAPI hdfcapi = new HDFCAPI();
    @Override
    public double getMoney(int acc) {
        hdfcapi.showBalance(acc);
        return 0;
    }

    @Override
    public boolean sendMoney(int from, int to, int amount) {
        hdfcapi.sendMoney(from, to, amount);
        return true;
    }

}
