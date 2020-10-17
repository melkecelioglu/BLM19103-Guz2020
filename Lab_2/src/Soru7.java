
import java.util.Scanner;

public class Soru7 {

    public static void main(String[] args) {

        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner s = new Scanner(System.in);

        // Kullanıcıdan iki adet tam sayı alınır.
        System.out.print("Bir Sayı Giriniz:");
        int sayi1 = s.nextInt();

        System.out.print("Bir Sayı Giriniz:");
        int sayi2 = s.nextInt();

        /*
        
        // Sayı1'in değerini kaybetmemek için ekstra bir değişken kullanılır.
        int yedek = sayi1;
        // Sayı1'in değeri Sayı2 ile değiştirilir.
        sayi1 = sayi2;
        // Sayı2'ye Sayı1'in değerinin tutulduğu değişkenin değeri atanır
        sayi2 = yedek;
         */
        // Aynı işlem numerik veriler için XOR operatörü ile de aşağıdaki gibi gerçekleştirilebilir.
        sayi1 = sayi1 ^ sayi2;
        sayi2 = sayi1 ^ sayi2;
        sayi1 = sayi1 ^ sayi2;

        System.out.println("Sayi1 = " + sayi1 + " - Sayi2 = " + sayi2);
    }
}
