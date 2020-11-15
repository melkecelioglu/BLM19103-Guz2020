
import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {

        int[] sayilar = {1, 4, 5, 2, 15, 24, 32};

        Scanner s = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = s.nextInt();
        
        boolean varMi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayi == sayilar[i]) {
                varMi = true;
                break;
            }
        }
        
        if (varMi) {
            System.out.println(sayi + " dizide bulundu.");
        }else{
            System.out.println(sayi + " dizide bulunmadı.");
        }

    }
}
