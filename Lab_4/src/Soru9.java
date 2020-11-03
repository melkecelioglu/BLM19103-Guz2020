
import java.util.Scanner;

/**
 * @file Soru9.java
 * @date Oct 28, 2020 , 10:50:19
 * @author Muhammet Alkan
 */
public class Soru9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kelime;
        System.out.print("Bir kelime giriniz : ");
        kelime = sc.next();

        // küçük karakterleri büyükleriyle değiştireceğiz (karakter karakter kontrol ederek)
        String yeniKelime = "";
        int fark = 'A' - 'a';

        for (int i = 0; i < kelime.length(); i++) {
            yeniKelime += (char) (kelime.charAt(i) + fark);
        }

        System.out.println(yeniKelime);
    }
}
