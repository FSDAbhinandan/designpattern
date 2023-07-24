package com.intermediate.designPattern.Factory.Example1;

public class AndroidUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AndroidButton();
	}

	@Override
	public Menue createMenue() {
		// TODO Auto-generated method stub
		return new AndroidMenue();
	}

}
