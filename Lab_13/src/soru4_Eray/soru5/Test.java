/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

/**
 *
 * @author TR
 */
public class Test {

    public static void main(String[] args) {

        Fabrika f1 = new Fabrika(1, 1923);
        
//        Sedan s1 = new Sedan("A", "b");
//        Suv s2 = new Suv("C", "d");
//        
//        s1.bilgileriYazdir();
//        s2.bilgileriYazdir();

        f1.otoUret();
        f1.otoUret();
        f1.otoUret();

        for (int i = 0; i < f1.getOtoListesi().size(); i++) {
            System.out.println(f1.getOtoListesi().get(i).getSatisFiyati());

        }
        
        f1.otoUret();
        
//        for (int i = 0; i < f1.getOtoListesi().size(); i++) {
//            System.out.println(f1.getOtoListesi().get(i));
//            
//        }

    }

}
