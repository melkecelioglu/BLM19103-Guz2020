
package kullanıcı;

/**
 *
 * @author melikekecelioglu
 */
public class Film {
    private String id;
    private String ad;
    private String tur;
    private double ucret;

    public Film(String id, String ad, String tur, double ucret) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.ucret = ucret;
    }

    public String getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getTur() {
        return tur;
    }

    public double getUcret() {
        return ucret;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    
    
}
