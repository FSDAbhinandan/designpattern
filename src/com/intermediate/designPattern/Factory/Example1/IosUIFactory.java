package com.intermediate.designPattern.Factory.Example1;

public class IosUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IosButton();
	}

	@Override
	public Menue createMenue() {
		// TODO Auto-generated method stub
		return new IosMenue();
	}

}
