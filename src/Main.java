import Hotel_reservation.Superclasses.Hotel;
import Hotel_reservation.Superclasses.Person;
import Hotel_reservation.Superclasses.Reservation;
import Hotel_reservation.subclasses.Customer;
import Hotel_reservation.subclasses.Receptionist;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runHotelReservation();

    }
    public static void runHotelReservation(){
        ArrayList<Person> staffs = new ArrayList<>();
        ArrayList<Person> customers = new ArrayList<>();
        // Otel oluşturma
        Hotel sinaninHotel = new Hotel("Sinan HOTEL",staffs,customers);

        // calısan ekle
        Receptionist ahu = new Receptionist("ahu","donmez",21,"3","female","2",23232);
        staffs.add(ahu);

        // musteri ekle
        ArrayList<Reservation> reservationsbedo = new ArrayList<>();
        Reservation reservation2 = new Reservation("bugun",4);
        reservationsbedo.add(reservation2);

        reservationsbedo.add(new Reservation("yarın",34));
        Customer bedo = new Customer("bedo","tong",23,"1","male","00000001",reservationsbedo);
        customers.add(bedo);

        ArrayList<Reservation> reservationsMtn = new ArrayList<>();
        Reservation reservation=new Reservation("salı",5);
        reservationsMtn.add(reservation);
        Customer metin = new Customer("metin","gültekin",23,"2","male","00000002",reservationsMtn);
        customers.add(metin);

        // Hotel giriş ekran
        System.out.println("Otel paneline hosgeldin" +
                "\nAşağıda yapabileceğin işlemler bulunmaktadır." +
                "\n1: Musteri islemleri" +
                "\n2: Rezervasyon Islemleri" +
                "\n3: exit");
        // ilk seçim
        Scanner scanner = new Scanner(System.in);
        int choosen = scanner.nextInt();
        switch (choosen){
            case 1 :
                musteriIslemleri(customers);
                break;
            case 2 :
                rezervasyonIslemleri();
                break;
            case 3 :
                System.out.println("Çıkış yapıldı.");break;
            default:
                System.out.println("İşlemlerden birini seçin lütfen"); break;
        }
    }
    public static void musteriIslemleri(ArrayList<Person> customers){
        System.out.println("Musteri islemlerine hosgeldin" +
                "\nAşağıda yapabileceğin işlemler bulunmaktadır." +
                "\n1: kayıt olusturma" +
                "\n2: kayıt silme" +
                "\n3: kayıt listeleme" +
                "\n4: EXİT");

        // Müşteri işlemleri seçimleri
        Scanner scanner = new Scanner(System.in);
        int choosen = scanner.nextInt();
        Customer customer;
        Customer yeniMusteri = new Customer("","",0,"","","",new ArrayList<>());
        switch (choosen){
            // kayıt oluşturma
            case 1 :
                ArrayList<Reservation> reservations = new ArrayList<>();
                scanner.nextLine();
                System.out.println("Lütfen yeni müşterin Sırasıyla Bilgilerini girin \n");

                System.out.print("Adınızı girin : ");
                yeniMusteri.setName(scanner.nextLine());

                System.out.print("Soyad girin : ");
                yeniMusteri.setSurname(scanner.nextLine());

                System.out.print("Age girin : ");
                yeniMusteri.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.print("TC girin : ");
                yeniMusteri.setIdNo(scanner.nextLine());

                System.out.print("Cinsiyet girin : ");
                yeniMusteri.setGender(scanner.nextLine());

                System.out.print("Tel no girin : ");
                yeniMusteri.setpNo(scanner.nextLine());

                customers.add(yeniMusteri);
                yeniMusteri.MusteriBilgileriniYaz1();
                break;
                // Kayıt silme
            case 2 :
                System.out.print("bana bir id ver : ");
                scanner.nextLine();
                String idNo = scanner.nextLine();
                boolean id=false;
                // MÜŞTERİLERİ GEZER
                for (Person person : customers) {
                    id=true;
                    customer = (Customer) person;

                    // VERİLEN İD İLE AYNI MÜŞTERİYİ BULAR VE SİLER
                    if (Objects.equals(customer.getIdNo(), idNo)) {

                        System.out.println("\n "+customer.getName() + " "+customer.getSurname()+
                                "\n Bu kullanıcıyı silmek istiyorsanız 1 " +
                                "\n istemiyorsanız 2 basınız.");
                        int delete ;
                        delete=scanner.nextInt();
                        switch (delete){
                            case 1 :
                        customers.remove(customer);
                        System.out.println(" "+customer.getName() + " "+customer.getSurname()+" isimli müşteri silindi.");
                        musteriIslemleri(customers);
                        break;
                        case 2 :
                            System.out.println("Müşteri silme işlemi iptal edildi."); break;
                        }
                }
               }
                if(!id) System.out.print("Böyle bir Müşteri bulunamadı.");
                break;

                // Kayıt Listeleme
            case  3:
                // MÜŞTERİLERİ GEZER
                for (Person person : customers) {
                    customer = (Customer) person;
                    System.out.println(" *** "+customer.getName()+" "+customer.getSurname()+" *** ");

                    // MÜŞTERİYE AİT REZERVASYONLARI GETİRİR.
                    for ( Reservation reservation :customer.getReservations()) {
                        System.out.println("Oda numarası : "+reservation.getrN()+ "\nRezervazson Tarihi : " + reservation.getDate());
                    }
                    System.out.println("\n----------------------");
                }
                break;    
            case 4:
                System.out.println("İşleminiz iptal edildi."); break;
            default:
                System.out.println("Geçerli bir işlem değeri girmediğiniz için işleminiz iptal edildi."); break;
        }
        musteriIslemleri(customers);
    }

    public static void rezervasyonIslemleri(){
        System.out.println("Rezervasyon islemlerine hosgeldin" +
                "\nAşağıda yapabileceğin işlemler bulunmaktadır." +
                "\n1: rezervasyon olusturma" +
                "\n2: rezervasyon silme" +
                "\n3: rezervasyon listeleme" +
                "\n4: EXİT");
    }


}
