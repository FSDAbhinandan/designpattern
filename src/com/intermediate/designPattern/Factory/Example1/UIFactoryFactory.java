package com.intermediate.designPattern.Factory.Example1;

public class UIFactoryFactory {
	public static UIFactory createUIFactoryForPlatform(SupportedPlatform platform) {
		if(platform.equals(SupportedPlatform.ANDROID))
			return new AndroidUIFactory();
		else if(platform.equals(SupportedPlatform.IOS))
			return new IosUIFactory();
		
		return null;
	}
}
