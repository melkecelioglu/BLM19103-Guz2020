/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.Arrays;

/**
 *
 * @author yakari
 */
public class main {

    public static void main(String[] args) {
//        Muhendis m1 = new Muhendis();
//        System.out.println(m1.zamYap(1000));
//        Personel personel = new Personel();
        Fabrika f1 = new Fabrika();
        
        Personel m1 = new Muhendis(1, "İbrahim Kaya", 3434.3, 12, "Mühendis");
        Personel m2 = new Muhendis(5, "Ayşe Demir", 6434.3, 17, "Mühendis");
        Personel i1 = new Isci(2, "Talha Dereyurt", 2929.2, 7, "İşçi");
        Personel i2 = new Isci(2, "Ahmet Şeker", 2727.7, 4, "İşçi");
        Personel s1 = new Stajyer(3, "Gürkan Yakar", 500.5, 1, "Stajyer");
        Personel s2 = new Stajyer(4, "Yusuf Çelik", 500.5, 1, "Stajyer");
        
        
        f1.personelEkle(s1);
        f1.personelEkle(m1);
        f1.personelEkle(i1);
        f1.personelEkle(s2);
        f1.personelEkle(m2);
        f1.personelEkle(i2);
        
        f1.bilgileriYazdir();
        f1.yillikZamYap();
//        m1.zamYap();
        f1.bilgileriYazdir();
       
        int personelSay=0;
        for ( Personel person : f1.getPersonelListesi()) {
            personelSay++;
            System.out.println(person);//toStringi kendi cagırıyor
        }
        
        System.out.println("Toplam personel sayısı = "+personelSay);
        System.out.println("toplam personel türü sayısı = "+ f1.personelSay().size());
   
        System.out.println("Mühendis sayısı = "+f1.personelSay().get(0));
        System.out.println("İşçi sayısı = "+f1.personelSay().get(1));
        System.out.println("Stajyer sayısı = "+f1.personelSay().get(2));
     
    }

}
