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
public class Yazar {

    private String ad, soyad;

    public Yazar(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

    public void setad(String p_ad) {

        ad = p_ad;

    }

    public String getad() {

        return ad;
    }

    public void setsoyad(String p_soyad) {

        soyad = p_soyad;

    }

    public String getsoyad() {

        return soyad;
    }

}
