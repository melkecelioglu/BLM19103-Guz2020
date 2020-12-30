/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soru5;

/**
 *
 * @author dikzu
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f1= new Fabrika(1, 1999);
        Kullanici k1 = new Kullanici("Ayşe yılmaz");
        Sedan sdn1 = new Sedan("m1 markası", "Model 1", 730, 800000, k1);
        Suv sv1 = new Suv ("m2 markası", "Model 2", 730, 800000, k1);
        f1.otoUret("m3 markası", "m4 modeli", 500);
        f1.otoListele();
        System.out.println("******************");
        f1.modifiyeEt(sv1);
        sv1.bilgileriYazdir();
        f1.modifiyeEt(sdn1);
        sdn1.bilgileriYazdir();
        f1.otoListele();
        System.out.println("*****************");
        f1.otoSat(k1, sv1);
        f1.otoListele();
        
    }
}
