
import java.util.Scanner;

public class S6 {

    public static int maksIndexBul(int[] dizi) {
        int maks = Integer.MIN_VALUE;
        int maksIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > maks) {
                maks = dizi[i];
                maksIndex = i;
            }
        }
        return maksIndex;
    }

    public static int minIndexBul(int[] dizi) {

        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != 0 && dizi[i] < min) {
                min = dizi[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void maksMinKarakter(String cumle) {
        int[] karakterFrekans = new int['z' - 'a' + 1];

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                continue;
            } else {
                karakterFrekans[cumle.charAt(i) - 'a']++;
            }
        }

        System.out.println("En fazla geçen karakter: " + (char)('a' + maksIndexBul(karakterFrekans)) + ", En az geçen karakter: " + (char)('a' + minIndexBul(karakterFrekans)));

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = s.nextLine();
        
        maksMinKarakter(cumle);

    }
}
