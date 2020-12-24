/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author melikekecelioglu
 */
public class Test {
    public static void main(String[] args) {
         Fabrika f1 = new Fabrika();
        
        Personel m1 = new Muhendis(1, "Mehmet Al", 6456.8, 5, "Mühendis");
        Personel m2 = new Muhendis(5, "Bars Ak", 9832.5, 10, "Mühendis");
        Personel i1 = new Isci(2, "Haluk Özdil", 2929.2, 3, "İşçi");
        Personel i2 = new Isci(2, "Sadi Evran", 2904.5, 2, "İşçi");
        Personel s1 = new Stajyer(3, "Ekrem Kirazlı", 200.1, 1, "Stajyer");
        Personel s2 = new Stajyer(4, "Batuhan Sevim", 354.5, 0, "Stajyer");
        
        
        f1.personelEkle(s1);
        f1.personelEkle(m1);
        f1.personelEkle(i1);
        f1.personelEkle(s2);
        f1.personelEkle(m2);
        f1.personelEkle(i2);
        
        f1.bilgileriYazdir();
        m1.zamYap();
        f1.bilgileriYazdir();
       
//        int personelSay=0;
//        for ( Personel plist : f1.getPersonelListesi()) {
//            personelSay++;
//            System.out.println(plist);//calling  toString
//        }
        
//        System.out.println("Toplam personel sayısı = "+personelSay);
   
        System.out.println("Mühendis sayısı = "+f1.personelSay().get(0));
        System.out.println("İşçi sayısı = "+f1.personelSay().get(1));
        System.out.println("Stajyer sayısı = "+f1.personelSay().get(2));
     
    
    }
}
