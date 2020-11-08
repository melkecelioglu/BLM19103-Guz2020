
package quiz;

public class Soru5 {

    public static int usAlma(int taban, int us) {
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc = sonuc * taban;
        }
        return sonuc;
    }
    
    public static boolean armstrongSayiMi(int sayi){
        int us = 3;
        int temp = sayi;

        int toplam = 0;
        while (sayi > 0) {
            toplam += usAlma(sayi % 10, us);
            sayi = sayi / 10;
        }
        
        if (temp == toplam) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {

        int sayi = 372;
        
        if(armstrongSayiMi(sayi))
            System.out.println("Armstrong Sayıdır");
        else
            System.out.println("Armstrong Sayı Değildir");



    }
}
