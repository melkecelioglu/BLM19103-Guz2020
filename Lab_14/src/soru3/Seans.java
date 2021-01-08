package Soru3;
public class Seans {
    
    private int id;
    private Film film;
    private int seansSaati;
    
    public Seans(int id, Film film, int seansSaati) {
        this.id = id;
        this.film = film;
        this.seansSaati = seansSaati;
    }

    public int getId() {
        return id;
    }
    
    public Film getFilm() {
        return film;
    }

    public int getSeansSaati() {
        return seansSaati;
    } 
}
