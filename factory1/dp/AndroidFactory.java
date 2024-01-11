package factory1.dp;

public class AndroidFactory implements FlutterFactory{
    @Override
    public Button createButton() {
         return new AndroidButton();
    }

    @Override
    public Menue createMenue() {
        return new AndroidMenue();
    }
}
