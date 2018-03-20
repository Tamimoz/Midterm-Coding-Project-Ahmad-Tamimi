package com.cisc181.core;


public class PersonException extends Exception{
	private Person person;

	public PersonException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonException(String arg0, Person person) {
		this.person = person;
		System.out.println(arg0);
	}
	

}
