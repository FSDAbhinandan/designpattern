package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class ChocolateScoop implements IceCream {

	IceCream ic;

	public ChocolateScoop(IceCream ic) {
		super();
		this.ic = ic;
	}

	@Override
	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+20;
		return 20;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Chocolate Scoop";
		return "Chocolate Scoop";
	}


}
