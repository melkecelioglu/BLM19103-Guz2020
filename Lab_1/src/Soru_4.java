
import java.util.Scanner;


public class Soru_4 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Lütfen bir n değeri giriniz: ");
        
        // Kullanıcıdan n değeri alınır
        int n = okuyucu.nextInt();
        
        // Sayıların toplamını hesapla
        double sayilarin_toplami = ((n) * (n + 1) * (2*n + 1)) / 6;
        
        // Sonucu ekrana yazdır
        System.out.println(n + " sayısına kadar ardışık sayıların karelerinin toplamı: " + sayilarin_toplami);
        
    }
}
