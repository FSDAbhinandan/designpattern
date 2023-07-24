package com.intermediate.designPattern.Prototype_Registry.Example1;

public class Client {
	
	
	public static void register(Registry reg) {
		IntelligentStudent is = new IntelligentStudent();
		is.setBatchAvgPsp(Constants.intelligentStudentAvgPsp);
		is.setBatch(Constants.isBatch);
		
		reg.register(Constants.isBatch, is);
		
		SmartStudent ss = new SmartStudent();
		ss.setBatchAvgPsp(Constants.ssStudentAvgPsp);
		ss.setBatch(Constants.ssBatch);
		
		reg.register(Constants.ssBatch, ss);
	}
	
	public static void main(String[] args) {
      	Registry reg = new Registry();
		register(reg); 
		
		Student abhinandan = reg.get(Constants.isBatch).copy();
		abhinandan.setAge(27);
		abhinandan.setName("Abhinandan");
		abhinandan.setPsp(77.0);
		
		Student bajpai = reg.get(Constants.ssBatch).copy();
		bajpai.setAge(29);
		bajpai.setName("bajpai");
		bajpai.setPsp(87.0);
		
		
       System.out.println(abhinandan.getBatch() + " " + bajpai.getBatch());
	}

}
