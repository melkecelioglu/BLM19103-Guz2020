/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstarct2;

import java.util.ArrayList;

/**
 *
 * @author ebrar
 */
public class Kullanici {

    protected String adSoyad;
    protected ArrayList<Otomobil> aracListesi;

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        aracListesi = new ArrayList<>();
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public ArrayList<Otomobil> getAracListesi() {
        return aracListesi;
    }

}
