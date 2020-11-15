/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

public class S4 {

    public static int findMaxDigit(int num) {
        int maks = 0;
        while (num > 0) {
            int kalan = num % 10;
            num = num / 10;

            if (kalan > maks) {
                maks = kalan;
            }
        }

        return maks;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz:");
        int sayi = s.nextInt();
        
        System.out.println("En büyük rakam:" + findMaxDigit(sayi));
    }
}
