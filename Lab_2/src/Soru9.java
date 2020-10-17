
import java.util.Scanner;


public class Soru9 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner s = new Scanner(System.in);
        
        // Kullanıcıdan mesafe ve zaman bilgileri alınır
        System.out.print("Mesafe bilgisini giriniz (km): ");
        int mesafe = s.nextInt();
        
        System.out.print("Zaman bilgisini giriniz (km/saat): ");
        int saat = s.nextInt();
        
        // YOL = HIZ x ZAMAN formülü üzerinden hesaplanabilir.
        double hiz = mesafe / saat;
        
        System.out.println("Saatteki Ortalama Hız: " + hiz);
    }
}
