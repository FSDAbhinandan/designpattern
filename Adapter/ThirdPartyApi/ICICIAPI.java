package Adapter.ThirdPartyApi;

public class ICICIAPI {
    public void showBalance(int acc){
        System.out.println(100000);
    }
    public void sendMoney(int from, int to, int amount){
        System.out.println(from+" to "+to+" "+amount+ " Transferred ");
    }
}
