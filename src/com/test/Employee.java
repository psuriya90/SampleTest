package com.test;

import com.demo.Sample;

public class Employee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.employeeId();
		
		Sample s=new Sample();
		s.sampleMethod();
		
		
	}
	
	private void employeeId() {
		System.out.println("Inside employeeId");
	}

}
