import java.util.Scanner;

class Soru3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("1.Sayıyı Giriniz: ");
        int sayi1 = sc.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        int sayi2 = sc.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        int sayi3 = sc.nextInt();
        
        int enBuyuk = sayi1;

        if(sayi2 > enBuyuk){
            enBuyuk = sayi2;
        } 
        if (sayi3 > enBuyuk){
            enBuyuk = sayi3;
        }

        System.out.println("En Büyük Sayı: " + enBuyuk);
	}
}