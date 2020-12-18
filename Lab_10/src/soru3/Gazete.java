/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9soru3;

/**
 *
 * @author Numan
 */
public class Gazete {

    private Haber haber;
    private String Ad;
    private Haber haberListesi[];
    private int habersayisi;

    Gazete(String Ad, int elemeanSayisi) {

        this.Ad = Ad;

        this.haberListesi = new Haber[elemeanSayisi];

    }

    public void HaberEkle(Haber haber) {

        for (int i = 0; i < haberListesi.length; i++) {

            if (haberListesi[i] == null) {
                haberListesi[i] = haber;
                break;
            }

        }

    }

    public void haberSil(Haber haber) {

        for (int i = 0; i < haberListesi.length; i++) {

            if (haberListesi[i].equals(haber)) {

                haberListesi[i] = null;
            }

        }

    }

    public void haberListele() {

        System.out.println(Ad + "\n---------------");

        for (int i = 0; i < haberListesi.length; i++) {

            if (haberListesi[i] != null) {
                System.out.println("Haber Id: " + haberListesi[i].getid() + "\nAciklama: " + haberListesi[i].getaciklama() + "\nBaslik: " + haberListesi[i].getbaslik()
                        + "\nYazar Bilgisi: " + haberListesi[i].getYazarBilgisi() + "\n");

            } else {

                System.out.println(i + 1 + " .haber silindi...\n---------------\n");

            }

        }
        System.out.println("");

    }

}
