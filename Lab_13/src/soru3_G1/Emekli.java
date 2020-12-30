/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biletix;

/**
 *
 * @author emin yasir corut
 */
public class Emekli extends Kullanici implements IBiletIslemleri, IOdemeIslemleri {

    int k, n;

    public Emekli(String adSoyad, int yas, int tcNo, double bakiye) {
        super(adSoyad, yas, tcNo, bakiye);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("adı soyadı= " + this.adSoyad);
        System.out.println("yaş= " + this.yas);
        System.out.println("tcNo= " + this.tcNo);
        System.out.println("bakiyesi= " + this.bakiye);
        System.out.println("kredi kartı ile ödeme sayısı= "+this.k);
        System.out.println("nakit ile ödeme sayısı = "+this.n);
    }

    @Override
    public void satinAl(Seans p) {

        p.film.setUcret(p.film.getUcret() - p.film.getUcret() * 15 / 100);
        setBakiye(bakiye - p.film.getUcret());
        System.out.println(p.film.ad + " filmi eklendi");

    }

    @Override
    public void kartOdeme(Seans s) {

        if (bakiye >= s.film.getUcret()) {
            System.out.println("kart ile ödeme");
            k++;
            this.satinAl(s);
        } else {
            System.out.println("Paranız " + s.film.ad + " adlı filme yetmiyor.Çünkü " + s.film.ad + " fıyatı = " + s.film.ucret);
        }
    }

    @Override
    public void nakitOdeme(Seans s) {
        if (bakiye >= s.film.getUcret()) {
            System.out.println("nakit ödeme");
            n++;
            this.satinAl(s);
            setBakiye(bakiye + s.film.ucret * 1 / 100);
        } else {
            System.out.println("Paranız " + s.film.ad + " adlı filme yetmiyor.Çünkü " + s.film.ad + " fıyatı = " + s.film.ucret);
        }
    }

}
