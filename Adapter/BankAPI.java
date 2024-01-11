package Adapter;

public interface BankAPI {

    double getMoney(int acc);

    boolean sendMoney(int from, int to, int amount);
}
