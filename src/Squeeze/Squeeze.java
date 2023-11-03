package Squeeze;

import java.util.Scanner;

public class Squeeze {

    // Kelimelerin aynı harflerini yakalayan metod
    public static void ChangeCase(String a1,String a2)
    {

        for (char c1 :a1.toCharArray()) { // 1. kelimenin her harfini arar
            boolean isSame = false; // harf aynı ise kullanılacak
            for (char c2:a2.toCharArray()) // 2. kelimenin her harfini arar
                // 2. kelimenin harfleri 1. kelime ile büyük küçük dahi uyuşuyor mu diye kontrol eder
                if ((int) c1 == (int) c2 - 32 || (int) c1 == (int) c2 + 32 || c1 == c2) {
                    isSame = true; // uyuşursa true değer döndürür ve diğer harfa geçer
                    break;
                }
            if (!isSame) // uyuşmayan harfleri ekrana yazar
            System.out.print(""+c1);
        }
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("1.Kelimenizi Girin = ");
        String text1=data.nextLine();
        System.out.print("2.Kelimenizi Girin = ");
        String text2=data.nextLine();
        ChangeCase(text1,text2);

    }
}
