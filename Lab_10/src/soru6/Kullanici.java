package lab;

public class Kullanici {

    private int id;
    private String ad;
    private String soyad;
    private String kullanici_adi;
    private int muzik_sayisi;
    private Muzik[] muzikListesi;

    public Kullanici(int p_id, String p_ad, String p_soyad, String p_kulllanici_adi, int muzik_sayisi) {
        id = p_id;
        ad = p_ad;
        soyad = p_soyad;
        kullanici_adi = p_kulllanici_adi;
        muzikListesi = new Muzik[muzik_sayisi];
    }

    public void setId(int p_id) {
        id = p_id;
    }

    public int getId() {
        return id;
    }

    public void setAd(String p_ad) {
        ad = p_ad;
    }

    public String getAd() {
        return ad;
    }

    public void setSoyad(String p_soyad) {
        soyad = p_soyad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setKullanici_adi(String pkullanici_adi) {
        kullanici_adi = pkullanici_adi;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void muzikEkle(Muzik muzik) {
        for (int i = 0; i < muzikListesi.length; i++) {
            if (muzikListesi[i] == null) {
                muzikListesi[i] = muzik;
                break;
            }
        } muzik_sayisi++;  
        if(muzik_sayisi>muzikListesi.length){
            System.out.println("En fazla "+ muzikListesi.length + " tane muzik girebilirsiniz...");
        }
    }

    public void muzikSil(Muzik muzik) {
        for (int i = 0; i < muzikListesi.length; i++) {
            if (muzikListesi[i].equals(muzik)) {
                muzikListesi[i] = null;
                muzik_sayisi--;   
            }
        }
    }

    public void muzikListele() {
        for (int i = 0; i < muzikListesi.length; i++) {
            if (muzikListesi[i] != null) {
                //System.out.println("Sanatci: " + muzikListesi[i].getSanatci().getAd() + muzikListesi[i].getSanatci().getSoyad());
                System.out.println("Muzik Id: " + muzikListesi[i].getId() + "\nMuzik ismi: " + muzikListesi[i].getIsim() + "\nSanatci: " + muzikListesi[i].getSanatciad());
            } else {
                System.out.println(i + ". muzik " + muzikListesi[i]);
            }
        }
    }

}
