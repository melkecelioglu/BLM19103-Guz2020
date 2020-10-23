import java.util.Scanner;

class Soru4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("1-7 Arasında Sayı Giriniz:");
        int sayi = sc.nextInt();

        switch (sayi) {
            case 1:
                System.out.print("Haftanın " + sayi + ".günü: Pazartesi" );
                break;
            case 2:
                System.out.print("Haftanın " + sayi + ".günü: Salı" );
                break;
            case 3:
                System.out.print("Haftanın " + sayi + ".günü: Çarşamba" );
                break;
            case 4:
                System.out.print("Haftanın " + sayi + ".günü: Perşembe" );
                break;
            case 5:
                System.out.print("Haftanın " + sayi + ".günü: Cuma" );
                break;
            case 6:
                System.out.print("Haftanın " + sayi + ".günü: Cumartesi" );
                break;
            case 7:
                System.out.print("Haftanın " + sayi + ".günü: Pazar" );
                break;
            default:
                System.out.print("Girilen sayı 1-7 arasında değil");
                break;
        }
        
    }
}