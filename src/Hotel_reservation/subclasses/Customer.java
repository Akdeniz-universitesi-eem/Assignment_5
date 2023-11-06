package Hotel_reservation.subclasses;

import Hotel_reservation.Superclasses.Person;
import Hotel_reservation.Superclasses.Reservation;

import java.util.ArrayList;

public class Customer extends Person {
    ArrayList<Reservation> reservations;

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Customer(String name, String surname, int age, String idNo, String gender, String pNo, ArrayList<Reservation> reservations) {
        super(name, surname, age, idNo, gender, pNo);
        this.reservations = reservations;
    }
public void MusteriBilgileriniYaz1(){
        super.MusteriBilgileriniYaz();
    System.out.println("");


}

}
