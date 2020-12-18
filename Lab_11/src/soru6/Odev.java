/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author beyza
 */
public class Odev {

    private int id;
    private String isim;
    private String dosya_adi;
    private Ogrenci ogrenci;

    public Odev(int id, String isim, Ogrenci ogrenci) {
        this.id = id;
        this.isim = isim;
        this.ogrenci = ogrenci;
        this.dosya_adi = ogrenci.getAd() + ogrenci.getSoyad();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }
   public void setDosyaAdi(String dosya_adi){
       this.dosya_adi = dosya_adi;
   }
    public String getDosyaAdi() {
        return dosya_adi;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

}
