package factory1.dp;

public class WindowsFactory implements FlutterFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menue createMenue() {
        return new WindowsMenue();
    }
}
