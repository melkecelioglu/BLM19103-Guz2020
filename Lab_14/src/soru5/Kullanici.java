
package lab_14;

/**
 *
 * @author Erdinc
 */
public class Kullanici {
    private String adSoyad;
    private Otomobil[] aracListesi = new Otomobil[5];
    
    public Kullanici (String adSoyad){
    this.adSoyad = adSoyad;
    }
    
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setOtomobilListesi(Otomobil[] aracListesi) {
        this.aracListesi = aracListesi;
    }

    public Otomobil[] getAracListesi() {
        return aracListesi;
    }
   
    
    
    
    
    
}
