package com.sabanciuniv.access;

public class Person {
	
	private String name;
	private String age;
	protected String department;
	
	String address;
	
	
	public Person(String _name,int _age){
	

	}
	public void speak(){
		
		System.out.println("Hi my name is " +name + "my age is " + age);
	}

	public void setName(String name){
		this.name = name;
			
		
	}
	
	public String getName(){
		return this.name;
	}
	

}
