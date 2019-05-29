package com.hotel.booking.main;

import java.util.List;

import com.hotel.booking.classes.Booking;
import com.hotel.booking.classes.Customer;
import com.hotel.booking.classes.Hotel;

public class App {
    public static void main( String[] args ) {
        Hotel hotel1 = new Hotel("Hotel 1", "Chicago", 5);
        Customer andre = new Customer("Andre", 25);
        Customer brad = new Customer("Brad", 33);
        Customer carly = new Customer("Carly", 22);
        Customer derek = new Customer("Derek", 40);
        Customer eunice = new Customer("Eunice", 36);
        hotel1.bookCustomer(andre);
        hotel1.bookCustomer(brad);
        hotel1.bookCustomer(carly);
        hotel1.bookCustomer(derek);
        hotel1.bookCustomer(eunice);
        Customer frank = new Customer("Frank", 28);
        hotel1.bookCustomer(frank);
        List<Booking> bookings = hotel1.getBookings();
        for (Booking booking: bookings) {
        	System.out.println("Customer " + booking.getCustomer().getCustomerId() + " at " + booking.getHotel().getName() + ": " + booking.getCustomer().getName());
        }
    }
}
