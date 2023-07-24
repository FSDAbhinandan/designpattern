package com.intermediate.designPattern.Prototype_Registry.Example1;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	Map<String, Student>  registryMap = new HashMap<>();
	
	public void register(String keyObj, Student studentObj) {
		registryMap.put(keyObj, studentObj);
		System.out.println();
	}
	
	public Student get(String keyObj) {
		Student student = registryMap.get(keyObj);
		return student; //registryMap.get(keyObj);
	}

}
