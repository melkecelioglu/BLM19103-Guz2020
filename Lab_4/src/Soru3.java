
import java.util.Scanner;

/**
 * @file Soru3.java
 * @date Oct 28, 2020 , 09:46:00
 * @author Muhammet Alkan
 */
public class Soru3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rastgeleSayi = (int) (Math.random() * 100 + 1);
        System.out.println("Tahmin edilecek sayı : " + rastgeleSayi);

        System.out.println("Tahmininizi giriniz (1-100 arasında): ");
        int tahmin = sc.nextInt();

        while (tahmin != rastgeleSayi) {    // doğru tahmin edilene kadar

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir tahminde bulun ! ");
            } else {
                System.out.println("Daha küçük bir tahminde bulun ! ");
            }

            tahmin = sc.nextInt();
        }

        System.out.println("Tebrikler !!");
    }
}
