package Hotel_reservation;

import java.util.ArrayList;
import java.util.Scanner;

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
    System.out.println(" "); }
    public void MusteriKayit(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Person> customers = new ArrayList<>();
        Customer yeniMusteri=new Customer("","",0,"","","",new ArrayList<>());
        System.out.println("Lütfen  Sırasıyla Bilgilerinizi girin \n");

        System.out.print("Adınızı girin : ");
        yeniMusteri.setName(scanner.nextLine());

        System.out.print("Soyad girin : ");
        yeniMusteri.setSurname(scanner.nextLine());

        System.out.print("yaş girin : ");
        yeniMusteri.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("TC girin : ");
        yeniMusteri.setIdNo(scanner.nextLine());

        System.out.print("Cinsiyet girin : ");
        yeniMusteri.setGender(scanner.nextLine());

        System.out.print("Tel no girin : ");
        String telNO = scanner.nextLine();
        yeniMusteri.setpNo(telNO);

        System.out.print("Kalmak istediğiniz Tarihi girin : ");
        String date = scanner.nextLine();

        System.out.print("Kalmak istediğiniz Oda numarası : ");
        int room = scanner.nextInt();

        TelNoRev kayit=new TelNoRev(date,room,telNO);

        customers.add(yeniMusteri);
        yeniMusteri.MusteriBilgileriniYaz1();
        System.out.println("\n Başarıyla Rezervasyon yaptınız.");
    }
}
