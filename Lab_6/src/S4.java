
import java.util.Scanner;

public class S4 {
    
    public static int basamakSayisi(int sayi){
        int sayac = 0;
        
        while(sayi > 0){
            sayi = sayi / 10;
            sayac++;
        }
        
        return sayac;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi Boyutu Giriniz:");
        int N = sc.nextInt();
        
        int[] dizi = new int[N];
        for (int i = 0; i < N; i++) {
            dizi[i] = 1 + (int)(Math.random() * 1000);
        }
        
        int ucBasamakliSayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            if(basamakSayisi(dizi[i]) == 3)
                ucBasamakliSayac++;
        }
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        
        System.out.println("\n" + ucBasamakliSayac);
    }
}
