package Hotel_reservation.subclasses;

import Hotel_reservation.Superclasses.Reservation;

public class TelNoRev extends Reservation {

    String telNo="";

    public TelNoRev(String date, int rN,String telNo) {
        super(date, rN);
        this.telNo = telNo;
    }
}
