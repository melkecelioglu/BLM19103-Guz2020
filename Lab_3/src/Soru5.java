
import java.util.Scanner;


public class Soru5 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("İki basamaklı bir sayı giriniz:");
        int sayi = s.nextInt();
        int tam_bolen_sayisi = 0;
        
        if (sayi % 6 == 0){
            tam_bolen_sayisi++;
        } if (sayi % 5 == 0){
            tam_bolen_sayisi++;
        } if (sayi % 4 == 0){
            tam_bolen_sayisi++;
        } if (sayi % 3 == 0){
            tam_bolen_sayisi++;
        } if (sayi % 2 == 0){
            tam_bolen_sayisi++;
        }
        
        System.out.println("Tam bölen sayısı: " + tam_bolen_sayisi);
    }
}
