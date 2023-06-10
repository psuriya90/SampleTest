package com.demo;

//Execution /Child class
public class Demo {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.demoId();
		
		Sample s=new Sample();
		s.sampleMethod();  //private methods can be accessed only within the class so modified as public
	}
	
	private void demoId() {
		System.out.println("Inside demoId");
	}

}
