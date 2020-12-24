/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

/**
 *
 * @author zekikus
 */
public class Test {
    
    
    public static void main(String[] args) {
        
        Daire d = new Daire("Daire", "Kırmızı", 3);
        
        Dikdortgen di = new Dikdortgen("Dikdörtgen", "Beyaz", 4, 5);
        
        System.out.println("Dairenin Alanı:" + d.alanHesapla());
        System.out.println("Dikdörtgenin Alanı:" + di.alanHesapla());
        
        
    }
}
