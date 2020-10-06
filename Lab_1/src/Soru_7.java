
import java.util.Scanner;


public class Soru_7 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Para Miktarını Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        int miktar = okuyucu.nextInt();
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Ay Cinsinden Zaman Değerini Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        int zaman = okuyucu.nextInt();
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Faiz Oranını Giriniz: ");
        // Kullanıcıdan tam sayı değer alınır
        double faiz = okuyucu.nextDouble();
        
        // Tutar değeri hesapla
        double tutar = (miktar * zaman * faiz) / 100;

        System.out.println("Tutar: " + tutar);
        
        
    }
}
