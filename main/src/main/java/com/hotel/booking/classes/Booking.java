package com.hotel.booking.classes;

import java.util.Date;

public class Booking {
	private Integer bookingId;
	private Hotel hotel;
	private Customer customer;
	private Date startDate;
	private Date endDate;
	
	private static Integer counter = 0;
	
	public Booking(Hotel hotel, Customer customer, Date startDate, Date endDate) {
		this.bookingId = ++Booking.counter;
		this.hotel = hotel;
		this.customer = customer;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getBookingId() {
		return bookingId;
	}
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
