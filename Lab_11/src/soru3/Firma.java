/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feyza Kuruçay
 */
public class Firma {
    private String id;
    private String isim;
    private String adres;

    public Firma() {
    }

    public Firma(String id, String isim, String adres) {
        this.id = id;
        this.isim = isim;
        this.adres = adres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
