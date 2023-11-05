package Hotel_reservation.subclasses;

import Hotel_reservation.interfaces.Reservation;

public class OnlineRev extends Reservation {
    String email="";


    public OnlineRev(String date, int rN,String email) {
        super(date, rN);
        this.email = email;
    }
}
