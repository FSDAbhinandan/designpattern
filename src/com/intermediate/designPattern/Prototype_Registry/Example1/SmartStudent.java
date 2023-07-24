package com.intermediate.designPattern.Prototype_Registry.Example1;

public class SmartStudent extends Student{
	private int smartnessPercent;
	
	
	
	
	public SmartStudent() {
		super();
		// TODO Auto-generated constructor stub
	}



//	public SmartStudent(Student student) {
//		super(student);
//		// TODO Auto-generated constructor stub
//	}



	public SmartStudent(SmartStudent sp) {
		super(sp);
		this.smartnessPercent = sp.smartnessPercent;
	}



	@Override
	public Student copy() {
		// TODO Auto-generated method stub
		return new SmartStudent(this);
	}



	public int getSmartnessPercent() {
		return smartnessPercent;
	}



	public void setSmartnessPercent(int smartnessPercent) {
		this.smartnessPercent = smartnessPercent;
	}

	
}
