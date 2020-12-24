
package kullanıcı;

/**
 *
 * @author melikekecelioglu
 */
public class Seans {
    private String id;
    private Film film;
    private int seans_saati;

    public Seans(String id,int seans_saati,Film film) {
        this.id = id;
        this.seans_saati = seans_saati;
        this.film=film;
    }

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public Film getFilm() {
        return film;
    }

    
    public void setFilm(Film film) {
        this.film = film;
    }

    
    public int getSeans_saati() {
        return seans_saati;
    }

   
    public void setSeans_saati(int seans_saati) {
        this.seans_saati = seans_saati;
    }

    
    
}
