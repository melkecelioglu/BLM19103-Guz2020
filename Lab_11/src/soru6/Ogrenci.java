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
import java.util.ArrayList;

public class Ogrenci {

    private int id;
    private String ad;
    private String soyad;
    private String mail;
    private ArrayList<Odev> odevListesi;

    public Ogrenci(int id, String ad, String soyad) {
        this.ad = ad;
        this.id = id;
        this.soyad = soyad;
        this.odevListesi = new ArrayList<>();
    }

    public void SetId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Odev> getOdevListesi() {
        return odevListesi;
    }

    public void odevEkle(Odev odev) {
        odevListesi.add(odev);
    }

    public void odevListele() {
       for(int i=0;i<odevListesi.size();i++){
        System.out.println("Ödev adı: " + odevListesi.get(i).getIsim() + " Dosya adı: " + odevListesi.get(i).getDosyaAdi());

       }
       
    }

}
