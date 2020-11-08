/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeki
 */
public class Soru6 {

    public static boolean mukemmelSayiMi(int sayi){
        int tam_bolenlerin_toplami = 0;
        
        for(int i=1; i < sayi; i++){
            if(sayi % i == 0){   
                tam_bolenlerin_toplami += i;
            }
        }

        if(tam_bolenlerin_toplami == sayi){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        boolean sonuc = mukemmelSayiMi(7);
        
        if (sonuc){
            System.out.println("Girilen Sayı Mükemmel.");
        } else{
            System.out.println("Girilen Sayı Mükemmel Değil.");
        }

    }
    
}
