
import java.util.Scanner;

/**
 * @file Soru6.java
 * @date Oct 28, 2020 , 10:50:19
 * @author Muhammet Alkan
 */
public class Soru6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cevaplar;
        String cevapAnahtari;

        // kendi cevaplarımızda boş olabilir diye nextLine() metoduyla okuduk
        System.out.print("Kendi cevaplarınızı giriniz : ");
        cevaplar = sc.nextLine();

        System.out.print("Cevap anahtarını giriniz : ");
        cevapAnahtari = sc.next();

        int dogruSayisi = 0;
        for (int i = 0; i < cevaplar.length(); i++) {
            if (cevaplar.charAt(i) == cevapAnahtari.charAt(i)) {
                dogruSayisi++;
            }
        }

        System.out.println("Doğru sayısı : " + dogruSayisi);
    }
}
