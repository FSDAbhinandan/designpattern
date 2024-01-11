package factory1.dp;

public class IosFactory implements FlutterFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menue createMenue() {
        return new IosMenue();
    }
}
