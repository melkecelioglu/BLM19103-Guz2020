
package soru4;

public abstract class Kullanici {
    private String adSoyad;
    private String kullanici_adi;
    private Gazete gazete;
    
    public Kullanici(String adSoyad, String kullanici_adi, Gazete gazete){
        this.adSoyad = adSoyad;
        this.kullanici_adi = kullanici_adi;
        this.gazete = gazete;
    }
    
    abstract void bilgileriYazdir();

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public Gazete getGazete() {
        return gazete;
    }

    public void setGazete(Gazete gazete) {
        this.gazete = gazete;
    }

}
