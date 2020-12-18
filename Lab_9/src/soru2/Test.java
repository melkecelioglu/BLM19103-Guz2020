/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zeki
 */
public class Test {
    public static void main(String[] args) {
        
        Malzeme vida = new Malzeme(123, "Vida", 0.5, 10);
        vida.malzemeKullan(11);
        vida.bilgileriYazdir();
        
        Malzeme ayna = new Malzeme(1234, "Ayna", 5, 6);
        ayna.malzemeKullan(3);
        ayna.bilgileriYazdir();
        
        Malzeme civi = new Malzeme(1235, "Çivi", 1, 50);
        Malzeme cekic = new Malzeme(1234, "Çekiç", 10, 20);

    }
}
