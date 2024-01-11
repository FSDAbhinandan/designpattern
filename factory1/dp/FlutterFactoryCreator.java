package factory1.dp;

public class FlutterFactoryCreator {

    public static FlutterFactory flutterFactoryCreator(SupportPLatform platform){
        if(platform.equals(SupportPLatform.ANDROID))
            return new AndroidFactory();
        else if (platform.equals(SupportPLatform.WINDOWS)) {
            return new WindowsFactory();
        } else if (platform.equals(SupportPLatform.IOS)) {
            return new IosFactory();
        }
        return null;
    }
}
