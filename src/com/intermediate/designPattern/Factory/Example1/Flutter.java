package com.intermediate.designPattern.Factory.Example1;

public class Flutter {
	void showSomething() {
		System.out.println("showing something from flutter class");
	}
	
	public UIFactory createUIFactory(SupportedPlatform  platform) {
//		below code can cause on OCP
//		if(platform.equals(SupportedPlatform.ANDROID))
//			return new AndroidUIFactory();
//		else if(platform.equals(SupportedPlatform.IOS))
//			return new IosUIFactory();
		
		return UIFactoryFactory.createUIFactoryForPlatform(platform);
	}
}
