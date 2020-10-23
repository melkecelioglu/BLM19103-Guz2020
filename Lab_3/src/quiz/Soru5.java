
package quiz;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.print("x noktası giriniz:");
        int x = s.nextInt();
        System.out.print("y noktası giriniz:");
        int y = s.nextInt();
        
        double uzaklik = Math.sqrt(x * x + y * y);
        
        if (uzaklik <= 2.0) {
            System.out.println("Kazanılan Puan:" + 20);
        } else if (uzaklik <= 8.0) {
            System.out.println("Kazanılan Puan:" + 10);
        } else if (uzaklik <= 15.0) {
            System.out.println("Kazanılan Puan:" + 5);
        } else{
            System.out.println("Kazanılan Puan:" + 0);
        }
        
        
    }
}
