package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class VanilaScoop implements IceCream {
	
	IceCream ic;
	
	public VanilaScoop(IceCream ic) {
		super();
		this.ic = ic;
	}

	@Override
	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+12;
		return 12;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Vanilla Scoop";
		return "Vanilla Scoop";
	}

}
