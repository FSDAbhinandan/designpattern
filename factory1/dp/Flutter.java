package factory1.dp;

public class Flutter {

    public void showTheam(){
        System.out.println("Show Theam");
    }
    public void setRefreshRate(){
        System.out.println("Setting Refresh Rate");
    }
    public FlutterFactory createFlutterFactory(SupportPLatform platform){
//        if(platform.equals(SupportPLatform.ANDROID))
//            return new AndroidFactory();
//        else if (platform.equals(SupportPLatform.WINDOWS)) {
//            return new WindowsFactory();
//        } else if (platform.equals(SupportPLatform.IOS)) {
//            return new IosFactory();
//        }
        return FlutterFactoryCreator.flutterFactoryCreator(SupportPLatform.IOS);
    }
}
