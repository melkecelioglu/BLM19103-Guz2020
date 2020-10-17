
import java.util.Scanner;


public class Soru5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz:");
        int sayi = s.nextInt();
        
        int onlar_basamagi = sayi / 10;
        int birler_basamagi = sayi % 10;
        
        int sayinin_tersi = birler_basamagi * 10 + onlar_basamagi;
        
        System.out.println("Sayının Tersi:" + sayinin_tersi);
    }
}
