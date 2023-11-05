import Hotel_reservation.interfaces.Hotel;
import Hotel_reservation.interfaces.Person;
import Hotel_reservation.interfaces.Reservation;
import Hotel_reservation.subclasses.Customer;
import Hotel_reservation.subclasses.Receptionist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> staffs = new ArrayList<>();
        ArrayList<Person> customers = new ArrayList<>();
        Hotel sinaninHotel = new Hotel("Sinan Baba",staffs,customers);

        // calısan ekle
        Receptionist ahu = new Receptionist("ahu","donmez",21,"3","female","2",23232);
        staffs.add(ahu);

        // musteri ekle
        ArrayList<Reservation> reservationsbedo = new ArrayList<>();
        Reservation reservation2 = new Reservation("bugun",4);
        reservationsbedo.add(reservation2);
        reservationsbedo.add(new Reservation("yarın",34));
        Customer bedo = new Customer("bedo","tong",23,"1","male","00000000",reservationsbedo);
        customers.add(bedo);

        ArrayList<Reservation> reservationsMtn = new ArrayList<>();
        Reservation reservation=new Reservation("salı",5);
        reservationsMtn.add(reservation);
        Customer metin = new Customer("metin","sdfds",23,"1","male","00000000",reservationsMtn);
        customers.add(metin);


        System.out.println("Otel paneline hosgeldin" +
                "\nAşağıda yapabileceğin işlemler bulunmaktadır." +
                "\n1: Musteri islemleri" +
                "\n2: Rezervasyon Islemleri" +
                "\n3: exit");

        Scanner scanner = new Scanner(System.in);
        int choosen = scanner.nextInt();
        switch (choosen){
            case 1 :
                musteriIslemleri(customers);
                break;
            case 2 :
                rezervasyonIslemleri();
                break;
            default:
                System.out.println("naber"); break;
        }


    }

    public static void musteriIslemleri(ArrayList<Person> customers){
        System.out.println("Musteri islemlerine hosgeldin" +
                "\nAşağıda yapabileceğin işlemler bulunmaktadır." +
                "\n1: kayıt olusturma" +
                "\n2: kayıt silme" +
                "\n3: kayıt listeleme" +
                "\n4: go back");


        Scanner scanner = new Scanner(System.in);
        int choosen = scanner.nextInt();
        Customer customer;

        switch (choosen){
            case 1 :
                ArrayList<Reservation> reservations = new ArrayList<>();
                Customer metin = new Customer("metin","sdfds",23,"1","male","00000000",reservations);
                customers.add(metin);
                break;
            case 2 :
                System.out.print("bana bir id ver : ");
                scanner.nextLine();
                String idNo = scanner.nextLine();
                boolean id=false;
                for (Person person : customers) {
                    id=true;
                    customer = (Customer) person;

                    if (Objects.equals(customer.getIdNo(), idNo)) {
                        System.out.println("\n "+customer.getName() + " "+customer.getSurname()+
                                "\n Bu kullanıcıyı silmek istiyorsanız 1 " +
                                "\n istemiyorsanız 2 basınız.");
                        int delete =0;
                        delete=scanner.nextInt();
                        switch (delete){
                            case 1 :
                        customers.remove(customer);
                        System.out.println(" "+customer.getName() + " "+customer.getSurname()+" isimli müşteri silindi.");
                        break;
                        case 2 :
                            System.out.println("Müşteri silme işlemi iptal edildi."); break;
                        }
                }
               }
                if(!id) System.out.print("Böyle bir Müşteri bulunamadı.");
                break;
            case  3:

                for (Person person : customers) {
                    customer = (Customer) person;
                    System.out.println("customer name: "+customer.getName());


                    for ( Reservation reservation :customer.getReservations()) {
                        System.out.println(reservation.getrN()+" : " + reservation.getDate());
                    }
                    System.out.println("\n------------------");
                }
                
                break;    
            default:
                System.out.println("naber"); break;
        }



    }

    public static void rezervasyonIslemleri(){
        System.out.println("Rezervasyon islemlerine hosgeldin" +
                "\nAşağıda yapabileceğin işlemler bulunmaktadır." +
                "\n1: rezervasyon olusturma" +
                "\n2: rezervasyon silme" +
                "\n3: rezervasyon listeleme" +
                "\n4: go back");
    }


}
