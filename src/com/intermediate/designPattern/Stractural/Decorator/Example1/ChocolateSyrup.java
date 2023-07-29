package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class ChocolateSyrup implements IceCream {

	IceCream ic;
	
	public ChocolateSyrup(IceCream ic) {
		super();
		this.ic = ic;
	}

	@Override
	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+7;
		return 7;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Chocolate Syrup";
		return "Chocolate Syrup";
	}

}
