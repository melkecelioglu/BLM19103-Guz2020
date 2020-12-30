/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru5;

import java.util.ArrayList;

/**
 *
 * @author TR
 */
public class Fabrika {

    private int id;
    private int kurulusYili;
    private ArrayList<Otomobil> otoListesi;

    public Fabrika(int id, int kurulusYili) {
        this.id = id;
        this.kurulusYili = kurulusYili;
        this.otoListesi = new ArrayList<>();
    }

    void otoUret() {
        int r = (int) (Math.random() * 2 + 1);

        if (r == 2) {
            Sedan sedan = new Sedan("Honda", "Sedan");
            otoListesi.add(sedan);
            sedan.satisFiyatiHesapla();

        }
        if (r == 1) {
            Suv suv = new Suv("Honda", "Suv");
            otoListesi.add(suv);
            suv.satisFiyatiHesapla();

        }
    }

    void otoSat(Kullanici k, Otomobil o) {
        otoListesi.remove(o);
        k.getAracListesi().add(o);
    }

    void modifiyeEt(Otomobil o) {
        int sayi = (int) (Math.random() * 3);

        while (o instanceof Sedan) {
            if (sayi == 0) {
                ((Sedan) o).navigasyonEkle();

            }
            if (sayi == 1) {
                ((Sedan) o).parkSensoruEkle();

            }
            if (sayi == 3) {
                ((Sedan) o).parkSensoruEkle();
                ((Sedan) o).navigasyonEkle();

            }

        }
    }

    public ArrayList<Otomobil> getOtoListesi() {
        return otoListesi;
    }
    
    
    
    

}
