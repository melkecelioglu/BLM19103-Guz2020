/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author beyza
 */
public class TestGazete {
    public static void main(String[] args) {
        
        Gazete g1 = new Gazete("A gazetesi", 1987);
        Kullanici k1 = new Kullanici("ayşe yılmaz", "ayseYilmaz", g1) {
            @Override
            public void bilgileriYazdir() {
            }
          
        };
        Admin ad1 = new Admin("ahmet yıldırım", "ahmet_yildirim", g1);
        Yazar y1 = new Yazar("burcu korkmaz", "korkmazBurcu", g1);
        Haber h1 = new Haber("spor", 2435, "futbol", y1);
        Haber h2 = new Haber("moda", 456, "yılın kıyafetleri", y1);
        
        ad1.haberEkle(h2);
        ad1.haberGuncelle(h2, "ayakkabı");
        y1.haberEkle(h2);
        ad1.haberEkle(h1);
        ad1.haberSil(h2);
        g1.haberListele();
        System.out.println("************");
        y1.bilgileriYazdir();
        System.out.println("*************");
        ad1.bilgileriYazdir();
        System.out.println("***********");
        g1.yazarEkle(k1);
        g1.yazarListele();
        
           
        
    }
}
