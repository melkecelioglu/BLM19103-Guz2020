/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Fabrika {
    private int id;
    private int ad;
    private ArrayList<Personel> personelListesi = new ArrayList<Personel>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public ArrayList<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public void setPersonelListesi(ArrayList<Personel> personelListesi) {
        this.personelListesi = personelListesi;
    }

    
    
    void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

     void yillikZamYap() {
        for (Personel personel : getPersonelListesi()) {
            personel.zamYap();
        }
    }

    void bilgileriYazdir() {
        for (Personel personel : getPersonelListesi()) {
            personel.bilgiVer();
        }
    }

     ArrayList<Integer> personelSay() {
        ArrayList<Integer> personelSayisi = new ArrayList<Integer>();
        personelSayisi.add(0);
        personelSayisi.add(0);
        personelSayisi.add(0);
        for (Personel personel : getPersonelListesi()) {
            if (personel instanceof Muhendis) {
                personelSayisi.set(0,(personelSayisi.get(0)+1));
            } else if (personel instanceof Isci) {
                personelSayisi.set(1, personelSayisi.get(1) + 1);
            } else if (personel instanceof Stajyer) {
                personelSayisi.set(2, personelSayisi.get(2) + 1);
            }
        }
        return personelSayisi;
    }
    
}
