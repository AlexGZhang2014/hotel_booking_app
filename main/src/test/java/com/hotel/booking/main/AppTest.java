package com.hotel.booking.main;

import com.hotel.booking.classes.Customer;
import com.hotel.booking.classes.Hotel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void bookCustomerSuccessMessage() {
    	Hotel hotel = new Hotel("Hotel 1", "Somewhere", 2);
    	Customer cust1 = new Customer("Cust 1", 24);
    	assertEquals(hotel.bookCustomer(cust1), cust1.getName() + ", your hotel room has been successfully booked.");
    }
	
	@Test
	public void bookCustomerCorrectNumberOfBookings() {
		Hotel hotel = new Hotel("Hotel 2", "Somewhere", 2);
    	Customer cust2 = new Customer("Cust 2", 24);
    	hotel.bookCustomer(cust2);
    	assertEquals(hotel.getBookings().size(), 1);
	}
	
	@Test
	public void bookCustomerFailureMessage() {
		Hotel hotel = new Hotel("Hotel 3", "Somewhere", 0);
    	Customer cust3 = new Customer("Cust 3", 24);
    	assertEquals(hotel.bookCustomer(cust3), "Sorry " + cust3.getName() + ", but this hotel is all booked.");
	}
	
	@Test
	public void bookCustomerCorrectRemainingRooms() {
		Hotel hotel = new Hotel("Hotel 4", "Somewhere", 2);
    	Customer cust4 = new Customer("Cust 4", 24);
    	hotel.bookCustomer(cust4);
    	assertEquals(Integer.valueOf(1), hotel.getAvailableRooms());
	}
	
	@Test
	public void bookCustomerCorrectCustomerName() {
		Hotel hotel = new Hotel("Hotel 5", "Somewhere", 2);
    	Customer cust5 = new Customer("Cust 5", 24);
    	hotel.bookCustomer(cust5);
    	assertEquals(hotel.getBookings().get(0).getCustomer().getName(), cust5.getName());
	}
}
