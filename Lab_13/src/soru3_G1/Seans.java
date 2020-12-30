/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biletix;

/**
 *
 * @author emin yasir corut
 */
public class Seans {
    protected int id;
    protected Film film;
    protected int seans_saati;

    public Seans(int id, Film film, int seans_saati) {
        this.id = id;
        this.film = film;
        this.seans_saati = seans_saati;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
