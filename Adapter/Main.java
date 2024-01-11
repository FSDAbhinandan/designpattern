package Adapter;

public class Main {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay(new HdfciBankAdapter());

        phonePay.getBalance(1);
        phonePay.sendMoney(111,222,1000000);
    }
}
