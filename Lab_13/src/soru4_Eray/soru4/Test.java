/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

/**
 *
 * @author TR
 */
public class Test {

    public static void main(String[] args) {
        Gazete g1 = new Gazete("Sabah", 1999);

        Admin a1 = new Admin("Ali Veli", "xxAliVelixx", g1);
        Yazar y1 = new Yazar("Ahmet", "xxAhmetxx", g1);
        Yazar y2 = new Yazar("mehmet", "xxMehmet", g1);

        Haber h1 = new Haber(1, "Asgari ucret", "asgari ucretin yeni fiyati belli oldu.", y2);
        Haber h2 = new Haber(2, "Corona", "Asilarda cip mi var?", y1);

        g1.yazarEkle(y2);
        g1.yazarEkle(y1);

     g1.yazarListele();

//        y1.haberEkle(h1);
//        y2.haberEkle(h2);
        a1.haberEkle(h1);
        a1.haberEkle(h2);

//        g1.haberListele();
        
        a1.haberGuncelle(h1, "AAAA");
        
//        g1.haberListele();
        
        a1.haberSil(h2);
        
        g1.haberListele();
        
        a1.bilgileriYazdir();
    }

}
