
import java.util.Scanner;


public class Soru10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N değerini giriniz:");
        int n = sc.nextInt();

        int faktoriyel = 1;
        int sayac = 1;
        while (n >= sayac) {
            faktoriyel *= sayac;
            sayac++;
        }

        System.out.println(n + " Faktöriyel:" + faktoriyel);
    }
}
