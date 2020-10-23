
import java.util.Scanner;

public class Soru13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Başlangıç değeri giriniz: ");
        int baslangic = sc.nextInt();
        System.out.print("Bitiş değeri giriniz: ");
        int bitis = sc.nextInt();
        
        int asal_adet = 0;
        
        for (int i = baslangic; i < bitis; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " Asal Sayı Değil.");
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.println(i + " Asal Sayı.");
                asal_adet++;
            }
        }
        
        System.out.println("Asal Sayı Adeti: " + asal_adet);

    }
}
