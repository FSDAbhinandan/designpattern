package com.intermediate.designPattern.Stractural.Decorator.Example1;

public class OrangeCone implements IceCream{
	
	IceCream ic;
	

	public OrangeCone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrangeCone(IceCream ic) {
		super();
		this.ic = ic;
	}

	@Override
	public int getcost() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getcost()+10;
		return 10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(ic!=null)
			return ic.getDescription()+" +Orange Cone";
		return "Orange Cone";
	}

}
