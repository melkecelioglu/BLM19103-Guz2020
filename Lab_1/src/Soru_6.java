
import java.util.Scanner;


public class Soru_6 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner okuyucu = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Santigrad cinsinden bir değer giriniz: ");
        // Kullanıcıdan santigrad değeri alınır
        float santigrad = okuyucu.nextFloat();
        
        // Fahrenheit değeri hesapla
        double fahrenheit = (santigrad * (9.0/5)) + 32;

        System.out.println(santigrad + " Santigrad, " + fahrenheit + " Fahrenheit Eder.");
        
        
    }
}
