
package quiz;

import java.util.Scanner;

public class Soru6 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = s.nextInt();
        
        int tek_sayi_adet = 0;
        int cift_sayi_adet = 0;
        int tek_sayi_toplam = 0;
        int cift_sayi_toplam = 0;
        
        while(sayi > 0){
            if((sayi % 10) % 2 == 0){
                cift_sayi_adet++;
                cift_sayi_toplam += sayi % 10;
            } else{
                tek_sayi_adet++;
                tek_sayi_toplam += sayi % 10;
            }
            
            sayi = sayi / 10;
        }
        
        System.out.println("Tek Sayıların Adeti: " + tek_sayi_adet);
        System.out.println("Çift Sayıların Adeti: " + cift_sayi_adet);
        System.out.println("Tek Sayıların Toplamı: " + tek_sayi_toplam);
        System.out.println("Çift Sayıların Toplamı: " + cift_sayi_toplam);
    }
}
