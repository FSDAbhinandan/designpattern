package com.intermediate.designPattern.Prototype_Registry.Example1;

public class IntelligentStudent extends Student{
	
	private int iq;
	
	

	public IntelligentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IntelligentStudent(IntelligentStudent st) {
		super(st);
		this.iq = iq;
	}



	@Override
	public Student copy() {
		// TODO Auto-generated method stub
		IntelligentStudent intelligentStudent = new IntelligentStudent(this);
		return new IntelligentStudent(this);
	}



	public int getIq() {
		return iq;
	}



	public void setIq(int iq) {
		this.iq = iq;
	}
	
	

}
