
import java.util.Scanner;

/**
 * @file Soru7.java
 * @date Oct 28, 2020 , 10:50:19
 * @author Muhammet Alkan
 */
public class Soru7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cumle;

        // cümlede boşluklar olabilir diye nextLine() metoduyla okuduk
        System.out.println("Cümle giriniz : ");
        cumle = sc.nextLine();

        // yasaklı karakter içermeyen cümlemizi burada oluşturacağız (karakter karakter)
        String yeniCumle = "";

        char okunanKarakter;
        for (int i = 0; i < cumle.length(); i++) {
            okunanKarakter = cumle.charAt(i);

            if (okunanKarakter != '_' && okunanKarakter != '!') { // ve kontrolleri arttırılabilir
                yeniCumle += okunanKarakter;
            }
        }

        System.out.println(yeniCumle);
    }
}
