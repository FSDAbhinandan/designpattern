package com.intermediate.designPattern.Prototype_Registry.Example1;

public class Student implements Prototype<Student>{
	private int age;
	private String name;
	private double psp;
	private String batch;
	private double batchAvgPsp;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Student student) {
		this.age = student.age;
		this.name = student.name;
		this.psp = student.psp;
		this.batch =student.batch;
		this.batchAvgPsp = student.batchAvgPsp;
	}
	@Override
	public Student copy() {
		// TODO Auto-generated method stub
		return new Student(this);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPsp() {
		return psp;
	}
	public void setPsp(double psp) {
		this.psp = psp;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public double getBatchAvgPsp() {
		return batchAvgPsp;
	}
	public void setBatchAvgPsp(double batchAvgPsp) {
		this.batchAvgPsp = batchAvgPsp;
	}
	
	
}
