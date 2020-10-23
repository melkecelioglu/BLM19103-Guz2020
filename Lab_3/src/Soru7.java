
import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("x1 noktasını giriniz:");
        int x1 = s.nextInt();
        System.out.print("y1 noktasını giriniz:");
        int y1 = s.nextInt();
        
        System.out.print("x2 noktasını giriniz:");
        int x2 = s.nextInt();
        System.out.print("y2 noktasını giriniz:");
        int y2 = s.nextInt();
        
        double uzaklik = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println("İki nokta arasındaki uzaklık: " + uzaklik);
    }
}
