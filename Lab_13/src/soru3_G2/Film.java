package Soru3;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public class Film {
    private int filmId;
    private String ad, tur;
    private double ucret;

    public Film(int filmId, String ad, String tur, double ucret) {
        this.filmId = filmId;
        this.ad = ad;
        this.tur = tur;
        this.ucret = ucret;
    }
    
    

    public String getAd() {
        return ad;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getTur() {
        return tur;
    }

    public double getUcret() {
        return ucret;
    }  
}
