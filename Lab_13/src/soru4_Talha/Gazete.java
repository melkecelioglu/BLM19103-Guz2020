
package soru4;

import java.util.ArrayList;

public class Gazete {
    private String ad;
    private int kurulus_yili;
    private ArrayList <Kullanici> kullaniciListesi;
    private ArrayList <Haber> haberListesi;
    
    public Gazete(String ad, int kurulus_yili){
        this.ad = ad;
        this.kurulus_yili = kurulus_yili;
        kullaniciListesi = new ArrayList<>();
        haberListesi = new ArrayList<>();
    }
    
    public void yazarEkle(Kullanici k){
        getKullaniciListesi().add(k);
    }
    
    public void yazarListele(){
        for (int i = 0; i < getKullaniciListesi().size(); i++) {
            System.out.println("Kullanici ad soyad: " + getKullaniciListesi().get(i).getAdSoyad());
            System.out.println("Kullanici nick: " + getKullaniciListesi().get(i).getKullanici_adi());
            System.out.println("Kullanicinin calistigi gazete adi: " + getKullaniciListesi().get(i).getGazete().getAd());
            System.out.println("Kullanicinin calistigi gazete kurulus yili: " + getKurulus_yili());
            System.out.println("-----------------------------");
        }
    }
    
    public void haberListele(){
        for (int i = 0; i < haberListesi.size(); i++) {
            System.out.println("Haber no: " + getHaberListesi().get(i).getHaberNo());
            System.out.println("Haberin basligi: " + getHaberListesi().get(i).getBaslik());
            System.out.println("Haber yazarinin adi ve soyadi: " + getHaberListesi().get(i).getYazar().getAdSoyad());
            System.out.println("Haberin yayinlandigi gazete: " + getHaberListesi().get(i).getYazar().getGazete().getAd());
            System.out.println("-----------------------------");
        }
    }

    public ArrayList <Haber> getHaberListesi() {
        return haberListesi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKurulus_yili() {
        return kurulus_yili;
    }

    public void setKurulus_yili(int kurulus_yili) {
        this.kurulus_yili = kurulus_yili;
    }

    public ArrayList <Kullanici> getKullaniciListesi() {
        return kullaniciListesi;
    }
    
}
