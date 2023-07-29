package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class VanillaSyrup implements IceCream {

	IceCream ic;

	public VanillaSyrup(IceCream ic) {
		super();
		this.ic = ic;
	}

	@Override
	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+5;
		return 5;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Vanilla Syrup";
		return "Vanilla Syrup";
	}

}
