package com.intermediate.designPattern.Singelton;
/* 1). make constructor private 
 * 2). create one globally accessible method*/

import java.util.List;

public class DataBase {
	private static DataBase instance = null;
	private String userNaem;
	private String password;
	private List<String> connections;
	
	public static DataBase getInstance() {
		if(instance ==null) {
			synchronized (instance) {
				if(instance==null) {
					instance = new DataBase();
				}
			}
		}
		return instance;
	}

}
