package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class ChocolateCone implements IceCream {
	IceCream ic;

	public ChocolateCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public ChocolateCone(IceCream ic) {
		super();
		this.ic = ic;
	}


	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+17;
		return 17;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Chocolate Cone";
		return "Chocolate Cone";
	}
}
