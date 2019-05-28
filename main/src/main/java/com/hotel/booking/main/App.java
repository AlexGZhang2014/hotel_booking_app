package com.hotel.booking.main;

import com.hotel.booking.classes.Customer;
import com.hotel.booking.classes.Hotel;

public class App {
    public static void main( String[] args ) {
        Hotel hotel1 = new Hotel("Hotel 1", "Chicago", 5);
        System.out.println(hotel1.getHotelId());
        System.out.println("separator");
        Customer andre = new Customer("Andre", 25);
        Customer brad = new Customer("Brad", 33);
        Customer carly = new Customer("Carly", 22);
        Customer derek = new Customer("Derek", 40);
        Customer eunice = new Customer("Eunice", 36);
        System.out.println(andre.getCustomerId());
        System.out.println(brad.getCustomerId());
        hotel1.addCustomer(andre);
        hotel1.addCustomer(brad);
        hotel1.addCustomer(carly);
        hotel1.addCustomer(derek);
        hotel1.addCustomer(eunice);
        Customer frank = new Customer("Frank", 28);
        hotel1.addCustomer(frank);
    }
}
