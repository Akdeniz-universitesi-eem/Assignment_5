package Hotel_reservation.Superclasses;

public class Person {
    String name="";
    String surname="";
    int age=0;
    String idNo="00000000000";
    String gender="";
    String pNo="";

    public Person(String name, String surname, int age, String idNo, String gender, String pNo) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.idNo = idNo;
        this.gender = gender;
        this.pNo = pNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }
    public void MusteriBilgileriniYaz(){
        System.out.println("\n ");
        System.out.println("İsim : "+name+
                "\nSoyisim : "+surname+
                "\nYaş : "+age+
                "\nTCNO: "+idNo+
                "\nCinsiyet : "+gender+
                "\nTelefon NO : "+pNo);
    }
}
