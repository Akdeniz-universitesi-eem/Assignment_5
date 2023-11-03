package ChangeCase;

import java.util.Scanner;

public class ChangeCase {

    // Harfleri Değiştiren metod
    public static void ChangeCase(String a)
    {
         for (char c :a.toCharArray()) { // Kelimenin tüm harflerini gezer
             if ((int) c >96 && (int) c <123) { // Harf küçük ise 32 çıkararak büyük yapar
                 char ascii= (char) ((int) c -32);
                 System.out.print(""+ascii); }

             else if ((int) c >64 && (int) c <91){ // Harf Büyük ise 32 ekleyerek küçük yapar
                 char ascii= (char) ((int) c +32);
                 System.out.print(""+ascii); }

             if ((int) c ==32) System.out.print(" "); // Boşluk varsa Boşluk atar.
         }
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Kelimenizi Girin = ");
        String text1=data.nextLine();  // kullanıcıdan kelime girdisi alır
        ChangeCase(text1);
    }
}
