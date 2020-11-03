
import java.util.Scanner;

/**
 * @file Soru4.java
 * @date Oct 28, 2020 , 10:01:59
 * @author Muhammet Alkan
 */
public class Soru4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char karakter;
        String kelime;

        System.out.println("Bir karakter giriniz : ");
        karakter = sc.next().charAt(0);

        System.out.println("Bir kelime giriniz : ");
        kelime = sc.next();

        int adet = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == karakter) {
                adet++;
            }
        }

        if (adet != 0) {
            System.out.println(karakter + " harfi " + kelime + " kelimesinde " + adet + " defa geçiyor.");
        } else {
            System.out.println("Hiç geçmiyor !");
        }
    }
}
