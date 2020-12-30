/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.util.ArrayList;

/**
 *
 * @author ebrar
 */
public class Fabrika {

    protected int id;
    protected String ad;
    protected ArrayList<Personel> personelListesi;

    public Fabrika(int id, String ad) {
        this.id = id;
        this.ad = ad;
        personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public void yillikZamYap() {
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).zamHesapla();

        }
    }

    public void bilgileriYazdir() {
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).bilgileriYazdir();
        }

    }

    public void personelSay() {
        int toplamMuh = 0;
        int toplamStaj = 0;
        int toplamIsci = 0;
        for (int i = 0; i < personelListesi.size(); i++) {
            if (personelListesi.get(i) instanceof Muhendis) {
                toplamMuh++;

            }
            if (personelListesi.get(i) instanceof Stajyer) {
                toplamStaj++;

            }
            if (personelListesi.get(i) instanceof Isci) {
                toplamIsci++;

            }
        }
        System.out.println("\nToplam Mühendis: " + toplamMuh);
        System.out.println("Toplam Stajyer: " + toplamStaj);
        System.out.println("Toplam İşçi: " + toplamIsci);

    }

}
