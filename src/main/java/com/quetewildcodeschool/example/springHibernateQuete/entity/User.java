package com.quetewildcodeschool.example.springHibernateQuete.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String city, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String city;
	private int age;
	
	@Override
	public String toString() {
		
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age=" + age + "]";
	}
	
	public Long getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
