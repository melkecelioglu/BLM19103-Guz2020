
import java.util.Scanner;


public class S3 {
    
    public static int aralikToplam(int [] dizi, int baslangic, int bitis){
        int toplam = 0;
        for (int i = baslangic; i <= bitis; i++) {
            toplam += dizi[i];
        }
        return toplam;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("N değeri giriniz: ");
        int n = sc.nextInt();
        
        int[] dizi = new int[n];
        System.out.print("Dizi:");
        for (int i = 0; i < n; i++) {
            dizi[i] = 1 + (int)(Math.random() * 100);
            System.out.print(dizi[i] + " ");
        }
        
        System.out.print("\nBaşlangıç Indis:");
        int baslangic = sc.nextInt();
        System.out.print("Bitiş Indis:");
        int bitis = sc.nextInt();
        
        
        System.out.println("Toplam: " + aralikToplam(dizi, baslangic, bitis));
        
    }
}
