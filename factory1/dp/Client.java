package factory1.dp;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        FlutterFactory flutterFactory = flutter.createFlutterFactory(SupportPLatform.ANDROID);
        Button button = flutterFactory.createButton();
        button.showButton();
        Menue menue = flutterFactory.createMenue();
        menue.showMenue();
    }
}
