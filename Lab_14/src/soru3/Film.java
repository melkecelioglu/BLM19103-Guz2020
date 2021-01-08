package Soru3;
public class Film {
    
    private int id;
    private String ad;
    private String tur;
    private double ucret;

    public Film(int id, String ad, String tur, double ucret) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.ucret = ucret;
    }
    
    public String getAd() {
        return ad;
    }

    public int getId() {
        return id;
    }

    public String getTur() {
        return tur;
    }

    public double getUcret() {
        return ucret;
    }  
}
