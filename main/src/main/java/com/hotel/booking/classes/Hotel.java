package com.hotel.booking.classes;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private Integer hotelId;
	private String name;
	private String location;
	private Integer availableRooms;
	private List<Customer> customers;
	
	private static Integer count = 0;
	
	public Hotel(String name, String location, Integer availableRooms) {
		this.hotelId = ++Hotel.count;
		this.name = name;
		this.location = location;
		this.availableRooms = availableRooms;
		this.customers = new ArrayList<Customer>();
	}
	
	public Integer getHotelId() {
		return hotelId;
	}
	
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Integer getAvailableRooms() {
		return availableRooms;
	}
	
	public void setAvailableRooms(Integer availableRooms) {
		this.availableRooms = availableRooms;
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	
	public void addCustomer(Customer customer) {
		if (this.availableRooms > 0) {
			this.customers.add(customer);
			this.setAvailableRooms(availableRooms - 1);
			System.out.println(customer.getName() + ", your hotel room has been successfully booked");
		} else {
			System.out.println("Sorry " + customer.getName() + ", but this hotel is all booked.");
		}
	}
}
