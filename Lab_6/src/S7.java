

import java.util.Scanner;

public class S7 {
    
    public static void tekrarEtmeyenler(int[] dizi) {
        int[] frekans = new int[10];
        
        for (int i = 0; i < dizi.length; i++) {
            frekans[dizi[i]]++;
        }
        
        for (int i = 0; i < frekans.length; i++) {
            if(frekans[i] == 0)
                continue;
            if(frekans[i] == 1)
                System.out.print(i + " ");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi Boyutu Giriniz:");
        int N = sc.nextInt();

        int[] dizi = new int[N];
        int rastgeleSayi = 0;
        for (int i = 0; i < N; i++) {
            rastgeleSayi = (int) (Math.random() * 10);
            dizi[i] = rastgeleSayi;
            System.out.print(rastgeleSayi + " ");
        }

        System.out.println("");

        tekrarEtmeyenler(dizi);
    }
}
