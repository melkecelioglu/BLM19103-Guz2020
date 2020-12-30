package Soru3;

/**
 *
 * @author Yusuf Ihsan Simsek
 */
public class Seans {
    private int seansId;
    private String seansSaati;
    private Film film;

    public Seans(int seansId, String seansSaati, Film film) {
        this.seansId = seansId;
        this.seansSaati = seansSaati;
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }

    public int getSeansId() {
        return seansId;
    }

    public String getSeansSaati() {
        return seansSaati;
    } 
}
