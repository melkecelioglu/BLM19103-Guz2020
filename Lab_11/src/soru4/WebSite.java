/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru4;

import java.nio.file.Files;
import java.util.ArrayList;

public class WebSite {

    private String url;
    private String isim;
    private ArrayList<Kullanici> kullaniciListesi;

    public WebSite(String isim) {
        this.isim = isim;
        this.kullaniciListesi = new ArrayList<>();
    }

    public ArrayList<Kullanici> getKullaniciListesi() {
        return kullaniciListesi;
    }

    public void kullaniciEkle(Kullanici kullanici) {
        kullaniciListesi.add(kullanici);
    }

    public String delete(String str, char yasakKarakter) {

        String yeniStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != yasakKarakter) {
                yeniStr += str.charAt(i);
            }
        }

        return yeniStr;

    }

    public String delete(String str, char[] karakterListesi) {

        String yeniStr = "";

        // Bunu ?sevdim_, [‘_’, ‘?’]
        for (int i = 0; i < str.length(); i++) {
            boolean varMi = false;
            for (int j = 0; j < karakterListesi.length; j++) {
                if (str.charAt(i) == karakterListesi[j]) {
                    varMi = true;
                    break;
                }
            }

            if (!varMi) {
                yeniStr += str.charAt(i);
            }

        }

        return yeniStr;
    }
}
