package com.intermediate.designPattern.Builder;

public class Main {
	
	public static void main(String[] args) {
		Student st = Student.builder()
		.withFirstName("Abhinandan")
		.build();
	}

}
