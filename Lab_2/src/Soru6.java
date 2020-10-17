
import java.util.Scanner;


public class Soru6 {
    public static void main(String[] args){
        
        // Kullanıcıdan girdi almak için gereken sınıfı oluştur
        Scanner s = new Scanner(System.in);
        
        // Kullanıcının değer girmesi için mesaj yazdır
        System.out.print("Bir Sayı Giriniz:");
        // Kullanıcıdan double değer alınır
        double sayi = s.nextDouble();
        
        // Integer kast işlemi gerçekleştirilerek sayının tam kısmı elde edilir
        int tam_kisim = (int) sayi;
        
        // Noktalı sayıdan, tam kısım çıkartılarak noktadan sonraki kısımlar elde edilir
        double noktali_kisim = sayi - tam_kisim;
       
        System.out.println("Girilen Sayının Noktalı Kısmı: " + noktali_kisim);
    }
}
