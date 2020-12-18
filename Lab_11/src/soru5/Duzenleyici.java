package LabDersi;


public class Duzenleyici {

    private Kullanici[] kullaniciListesi;
    private int kullaniciMiktari;
    private int mevcutKullanici;

    
    public Duzenleyici(int kullaniciMiktari) {
        this.kullaniciListesi = new Kullanici[kullaniciMiktari];
    }

    public void kullaniciEkle(Kullanici gelenKullanici) {
        if ((mevcutKullanici + 1 < kullaniciListesi.length) && (mevcutKullanici + 1 >= 0)) {
            kullaniciListesi[mevcutKullanici] = gelenKullanici;
            mevcutKullanici++;
        } else {
            System.out.println("Istenilen miktardan fazla kullaniciya sahipsin");
        }
    }

    public String replace(String aciklama, char aranan, char degistir) {//Tek bir karakteri bulup yer degistirir.
        String yeniAciklama = "";
        for (int i = 0; i < aciklama.length(); i++) {
            if (aciklama.charAt(i) == aranan) {
                yeniAciklama += degistir;
            } else {
                yeniAciklama += aciklama.charAt(i);
            }
        }
        return yeniAciklama;
    }

    public String replace(String aciklama, char[] aranan, char degistir) {//Birden fazla karakteri bulup yer degistirir.
        String yeniAciklama = "";
        boolean harfVarMi = true;

        for (int i = 0; i < aciklama.length(); i++) {
            harfVarMi = true;

            for (int j = 0; j < aranan.length; j++) {
                if (aciklama.charAt(i) == aranan[j]) {
                    yeniAciklama += degistir;
                    harfVarMi = true;
                    break;
                } else {
                    harfVarMi = false;
                }
            }
            if (harfVarMi == false) {
                yeniAciklama += aciklama.charAt(i);
            }
        }
        return yeniAciklama;
    }
    
    public int getMevcutKullanici() {
        return mevcutKullanici;
    }

    public int getKullaniciMiktari() {
        return kullaniciMiktari;
    }

    public Kullanici[] getKullaniciListesi() {
        return kullaniciListesi;
    }

    public void setKullaniciMiktari(int sayi) {
        kullaniciMiktari = sayi;
    }
}
