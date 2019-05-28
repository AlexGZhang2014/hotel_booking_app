package com.hotel.booking.main;

import com.hotel.booking.classes.Customer;
import com.hotel.booking.classes.Hotel;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void addCustomerSuccessMessage() {
    	Hotel hotel = new Hotel("Hotel 1", "Somewhere", 2);
    	Customer cust1 = new Customer("Cust 1", 24);
    	assertEquals(hotel.addCustomer(cust1), cust1.getName() + ", your hotel room has been successfully booked.");
    }
	
	@Test
	public void addCustomerFailureMessage() {
		Hotel hotel = new Hotel("Hotel 2", "Somewhere", 0);
    	Customer cust2 = new Customer("Cust 2", 24);
    	assertEquals(hotel.addCustomer(cust2), "Sorry " + cust2.getName() + ", but this hotel is all booked.");
	}
	
	@Test
	public void addCustomerCorrectRemainingRooms() {
		Hotel hotel = new Hotel("Hotel 3", "Somewhere", 2);
    	Customer cust3 = new Customer("Cust 3", 24);
    	hotel.addCustomer(cust3);
    	assertEquals(Integer.valueOf(1), hotel.getAvailableRooms());
	}
}
