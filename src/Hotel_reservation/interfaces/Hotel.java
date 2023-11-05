package Hotel_reservation.interfaces;

import java.util.ArrayList;

public class Hotel {
    String name = "";
    ArrayList<Person> staffs;
    ArrayList<Person> customers;

    public Hotel(String name, ArrayList<Person> staffs,ArrayList<Person> customers) {
        this.name = name;
        this.staffs = staffs;
        this.customers = customers;
    }
}
