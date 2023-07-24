package com.intermediate.designPattern.Factory.Example1;

public class client {
	
	public static void main(String[] args) {
		Flutter flutter = new Flutter();
		UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.IOS);
		
		uiFactory.createButton().sowButton();
		uiFactory.createMenue().showMenye();
	}

}
