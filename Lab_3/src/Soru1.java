import java.util.Scanner;

class Soru1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Bir sayı Giriniz:");
        int sayi = sc.nextInt();

        int kalan = sayi % 2;

        /*
        IF-ELSE Versiyonu
        ----------------------

        if (kalan == 0){
            System.out.println(sayi + " Çift Sayıdır.");
        } 
        else {
            System.out.println(sayi + " Tek Sayıdır.");
        }
        */

        /*
        SWITCH - CASE Versiyonu
        ------------------------
        switch(kalan){
            case 0:
                System.out.println(sayi + " Çift Sayıdır.");
                break;
            case 1:
                System.out.println(sayi + " Tek Sayıdır.");
                break;
            default:
                System.out.println("Hata Oluştu...");
                break;
        }
        */
        
	}
}