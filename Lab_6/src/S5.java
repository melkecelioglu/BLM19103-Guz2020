
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zekikus
 */
public class S5 {
    public static void noktasalCarpim(int[] dizi1, int[] dizi2){
        int[] noktasalCarpim = new int[dizi1.length];
        System.out.print("\nNoktasal Çarpım:");
        for (int i = 0; i < dizi1.length; i++) {
            noktasalCarpim[i] = dizi1[i] * dizi2[i];
            System.out.print(dizi1[i] * dizi2[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi Boyutu Giriniz:");
        int N = sc.nextInt();
        
        int[] dizi1 = new int[N];
        int rastgeleSayi = 0;
        for (int i = 0; i < N; i++) {
            rastgeleSayi = 1 + (int)(Math.random() * 100);
            dizi1[i] = rastgeleSayi;
            System.out.print(rastgeleSayi + " ");
        }
        
        System.out.println("");
        
        int[] dizi2 = new int[N];
        for (int i = 0; i < N; i++) {
            rastgeleSayi = 5 + (int)(Math.random() * (50 - 5 + 1));
            dizi2[i] = rastgeleSayi;
            System.out.print(rastgeleSayi + " ");
        }
        
       noktasalCarpim(dizi1, dizi2);
        
        
    }
}
