package com.hotel.booking.classes;

public class Hotel {
	private String name;
	private String location;
	private Integer availableRooms;
	
	
	public Hotel(String name, String location, Integer availableRooms) {
		super();
		this.name = name;
		this.location = location;
		this.availableRooms = availableRooms;
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
}
