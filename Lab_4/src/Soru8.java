
import java.util.Scanner;

/**
 * @file Soru8.java
 * @date Oct 28, 2020 , 10:50:19
 * @author Muhammet Alkan
 */
public class Soru8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kelime;
        System.out.print("Bir kelime giriniz : ");
        kelime = sc.next();

        char istenmeyenKarakter;
        System.out.print("Değiştirilmek istenen karakteri giriniz : ");
        istenmeyenKarakter = sc.next().charAt(0);

        char yeniKarakter;
        System.out.print("Yerine koyulacak karakteri giriniz : ");
        yeniKarakter = sc.next().charAt(0);

        // istenmeyen karakteri değiştirerek kelimemizi burada oluşturacağız (karakter karakter kontrol ederek)
        String yeniKelime = "";

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == istenmeyenKarakter) {   // değiştirme kontrolü
                yeniKelime += yeniKarakter;
            } else {
                yeniKelime += kelime.charAt(i);
            }
        }

        System.out.println(yeniKelime);
    }
}
