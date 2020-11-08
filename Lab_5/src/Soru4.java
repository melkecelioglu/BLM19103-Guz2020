
import java.util.Scanner;


public class Soru4 {

    public static int tersCevir(int sayi) {
        
        int tersi = 0;
        while(sayi > 0) {
            int kalan = sayi % 10;
            tersi = tersi * 10 + kalan;
            sayi /= 10;
        }
        
        return tersi;
                
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = s.nextInt();
        
        System.out.println("Girilen Sayının Tersi: " + tersCevir(sayi));
    }
    
}
