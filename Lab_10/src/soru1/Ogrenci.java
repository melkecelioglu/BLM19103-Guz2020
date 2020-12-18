/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

/**
 *
 * @author Muhammet
 */
public class Ogrenci {

    private int no;
    private String ad;
    private String soyad;
    private Ders[] dersListesi;

    public Ogrenci(int no, String ad, String soyad) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        dersListesi = new Ders[5];
    }

    void dersEkle(Ders yeniDers) {
        for (int i = 0; i < dersListesi.length; i++) {
            if (dersListesi[i] == null) {
                dersListesi[i] = yeniDers;
                yeniDers.ogrenciEkle(this);
                break;
            }
        }
    }

    void dersListele() {
        for (int i = 0; i < dersListesi.length; i++) {
            if (dersListesi[i] != null) {
                System.out.println(dersListesi[i].getId() + " : " + dersListesi[i].getAd());
            }
        }
    }

    public int getNo() {
        return no;
    }

    public String getTamAd() {
        return ad + " " + soyad;
    }

}
