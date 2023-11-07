package Hotel_reservation;

public class Reservation {
    String date="";
    int rN=0;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getrN() {
        return rN;
    }

    public void setrN(int rN) {
        this.rN = rN;
    }

    public Reservation(String date, int rN) {
        this.date = date;
        this.rN = rN;
    }


}
