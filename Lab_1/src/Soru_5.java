
import java.util.Scanner;


public class Soru_5 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Kısa kenar değeri giriniz: ");
        // Kullanıcıdan kısa kenar değeri alınır
        int kisa_kenar = okuyucu.nextInt();
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Uzun kenar değeri giriniz: ");
        // Kullanıcıdan uzun kenar değeri alınır
        int uzun_kenar = okuyucu.nextInt();
        
        // Dikdörtgen alan hesapla
        double alan = kisa_kenar * uzun_kenar;
        // Dikdörtgen çevre hesapla
        double cevre = 2 * kisa_kenar  +  2 * uzun_kenar;
        
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
        System.out.println("Dikdörtgenin Alanı: " + alan);
    }
}
