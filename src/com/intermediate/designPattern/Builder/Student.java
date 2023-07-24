package com.intermediate.designPattern.Builder;

public class Student {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private int age;
	private double experience;
	
	//1). Hide the constructor
	private Student() {}
	
	public static Builder builder() {
		return new Builder();
	}
	
	//2). Create static inner class- friend class
	
	static class Builder{
		//2.5)copy all fields of main class
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String email;
		private int age;
		private double experience;
		
		public Builder withFirstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		public Builder withLasttName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		public Builder withPhoneNumber(String phoneNumber) {
			this.phoneNumber=phoneNumber;
			return this;
		}
		public Builder withEmail(String email) {
			this.email=email;
			return this;
		}
		public Builder withAge(int age) {
			this.age=age;
			return this;
		}
		public Builder withExperience(double experience) {
			this.experience=experience;
			return this;
		}
		
		//3). add all values in main class
		public Student build() {
//			if(!isValid()) {
//				throw new IllegalAccessError("Kuch to gadbad hai daya");
//			}
			Student st = new Student();
			st.firstName=this.firstName;
			st.lastName=this.lastName;
			st.age=this.age;
			st.email=this.email;
			st.phoneNumber=this.phoneNumber;
			st.experience=this.experience;
			
			return st;
		}
		
		public boolean isValid() {
			if(firstName.equals(null) || lastName.equals(null)) {
				return false;
			}
			return true;
		}
	}

}
