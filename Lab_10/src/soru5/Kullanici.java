
package soru5;

/**
 *
 * @author yakari
 */
public class Kullanici {
    private int id;
    private String ad;
    private String soyad;
    private String kullaniciAdi;

    public Kullanici(){
//        this(0,null,null,null);
    }
    public Kullanici(int id, String ad, String soyad, String kullaniciAdi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
}
