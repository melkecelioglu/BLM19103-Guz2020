import java.util.Scanner;

class Soru2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Bir sayı Giriniz:");
        int sayi = sc.nextInt();

        int kalan = sayi % 2;

        String sonuc = kalan == 0 ? (sayi + " Çift Sayıdır") : (sayi + " Tek Sayıdır");
        System.out.print(sonuc); 
        
	}
}