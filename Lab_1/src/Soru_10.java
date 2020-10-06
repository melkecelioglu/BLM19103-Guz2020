
import java.util.Scanner;


public class Soru_10 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Tam Sayı Değeri Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        int sayi = okuyucu.nextInt();
        
        // Yeni Fiyat değerini hesapla
        int son_rakam = sayi % 10;

        System.out.println(sayi + " Son Rakamı: " + son_rakam);
        
        
    }
}
