
import java.util.Scanner;

public class S8 {

    static void solaKaydir(int dizi[], int n, int kaydir) {
        int[] yeniDizi = new int[n];
        int mod = kaydir % n;

        int yeniIndex = 0;
        for (int i = 0; i < n; ++i) {
            if (i - kaydir < 0) {
                yeniIndex = (n - Math.abs(i - kaydir));
            } else {
                yeniIndex = i - kaydir;
            }

            yeniDizi[yeniIndex] = (dizi[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(yeniDizi[i] + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        int dizi[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = dizi.length;

        int k = 3;

        solaKaydir(dizi, n, k);

    }

}
