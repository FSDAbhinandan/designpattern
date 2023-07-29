package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class VanilaCone implements IceCream {
	IceCream ic;
	
	

	public VanilaCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VanilaCone(IceCream ic) {
		super();
		this.ic = ic;
	}

	@Override
	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+8;
		return 8;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Vanila Cone";
		return "Vanila Cone";
	}

}
