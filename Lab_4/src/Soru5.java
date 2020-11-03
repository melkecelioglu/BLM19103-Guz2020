
import java.util.Scanner;

/**
 * @file Soru5.java
 * @date Oct 28, 2020 , 10:22:14
 * @author Muhammet Alkan
 */
public class Soru5 {

    public static void main(String[] args) {

        // palindrome kontrol
        // küçük - küçük   -- karşılıklı kontrol edilecek karakterler 0-4, 1-3, 2-2, 3-1, 4-0
        Scanner sc = new Scanner(System.in);

        String kelime;

        System.out.println("Bir kelime giriniz : ");
        kelime = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < kelime.length(); i++) {
            char siradakiKarakter = kelime.charAt(i);
            char terstenKarsilikGelenKarakter = kelime.charAt(kelime.length() - i - 1);

            if (siradakiKarakter != terstenKarsilikGelenKarakter) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println((isPalindrome) ? "Kelime palindrome." : "Kelime palindrome değil.");

        // yukarıdaki tek satırlık if kontrolünün uzun hali
        if (isPalindrome) {
            System.out.println("Kelime palindrome.");
        } else {
            System.out.println("Kelime palindrome değil.");
        }

    }
}
