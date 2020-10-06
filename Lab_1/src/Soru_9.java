
import java.util.Scanner;


public class Soru_9 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Ürünün Eski Fiyatını Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        float eski_fiyat = okuyucu.nextFloat();
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Zam Oranını Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        float zam_orani = okuyucu.nextFloat();
        
        // Yeni Fiyat değerini hesapla
        double yeni_fiyat = ((eski_fiyat * zam_orani) / 100) + eski_fiyat;

        System.out.println("Yeni Fiyat: " + yeni_fiyat);
        
        
    }
}
