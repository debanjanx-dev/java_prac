package com.ibm.healthapplication;

public class Patient {
	int paitientid;
	String Patientname;
	int age;
	String Disease;
	
	//constructor
	public Patient(int patientid , String PatientName , int age , String Disease) {
		this.paitientid = patientid;
		this.Patientname = PatientName;
		this.age = age;
		this.Disease = Disease;
	}
	
	public void Display() {
		System.out.println(
				"ID: " + paitientid +
	            ", Name: " + Patientname +
	            ", Age: " + age +
	            ", Disease: " + Disease
				);
	}
}
