package com.hotel.booking.classes;

public class Customer {
	private Integer customerId;
	private String name;
	private Integer age;
	
	private static Integer count = 0;
	
	public Customer(String name, Integer age) {
		this.customerId = ++Customer.count;
		this.name = name;
		this.age = age;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
}
