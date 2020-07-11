package com.springboot.demo.enitity;

import lombok.Data;

@Data
public class Person {

	public String firstName;
	public String lastName;
	public int age;
	public String eduName;
	public String endedYear;

	public Person(String firstName, String lastName, int age, String eduName, String endedYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.eduName = eduName;
		this.endedYear = endedYear;
	}

}
