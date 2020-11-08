
import java.util.Scanner;

public class Soru5 {

    public static int faktoriyel(int sayi) {
        
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        
        return faktoriyel;
                
    }
    
    public static boolean gucluSayiMi(int sayi){
        int sonuc = 0;
        int temp = sayi;
        
        while(sayi > 0){
            int kalan = sayi % 10;
            sonuc += faktoriyel(kalan);
            sayi /= 10;
        }
        
        if(sonuc == temp)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = s.nextInt();
        
        System.out.println("Girilen Sayı Güçlü Sayı Mı?: " + gucluSayiMi(sayi));
    }

}
