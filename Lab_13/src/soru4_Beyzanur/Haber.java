/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author beyza
 */
public class Haber {
    
    private String baslik;
    private int haberNo;
    private String aciklama;
    private Yazar yazar;

    public Haber(String baslik, int haberNo, String aciklama, Yazar yazar) {
        this.baslik = baslik;
        this.haberNo = haberNo;
        this.aciklama = aciklama;
        this.yazar = yazar;
    }
    
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getHaberNo() {
        return haberNo;
    }

    public void setHaberNo(int haberNo) {
        this.haberNo = haberNo;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
    
}
