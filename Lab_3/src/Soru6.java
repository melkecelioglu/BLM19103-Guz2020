import java.util.Scanner;

class Soru6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Vize Notu Giriniz:");
        int vizeNot = sc.nextInt();
        System.out.print("Final Notu Giriniz:");
        int finalNot = sc.nextInt();
        
        int donemSonu = ((vizeNot * 40) / 100) + ((finalNot * 60) / 100);

        if (donemSonu > 75 && donemSonu <= 100){
            System.out.println("Harf Notu: AA");
        } 
        else if(donemSonu > 40 && donemSonu <= 75){
            System.out.println("Harf Notu: CC");
        }
        else if(donemSonu <= 40){
            System.out.println("Harf Notu: FF");
        } 
    }
}