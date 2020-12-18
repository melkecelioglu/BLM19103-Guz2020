
package soru1;

public class Uretici {
    
    private int id;
    private String ad;
    private String ulke;

    public Uretici(int id, String ad, String ulke) {
        this.id = id;
        this.ad = ad;
        this.ulke = ulke;
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

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
    
    
    
}
