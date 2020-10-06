
import java.util.Scanner;


public class Soru_8 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Ürünün Eski Fiyatını Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        float eski_fiyat = okuyucu.nextFloat();
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Ürünün Yeni Fiyatını Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        float yeni_fiyat = okuyucu.nextFloat();
        
        // Tutar değeri hesapla
        double zam_orani = ((yeni_fiyat - eski_fiyat) / eski_fiyat) * 100;

        System.out.println("Zam Oranı: %" + zam_orani);
        
        
    }
}
