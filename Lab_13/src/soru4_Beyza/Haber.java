/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soru4;

/**
 *
 * @author ayza
 */
public class Haber {

    public int getHaberNo() {
        return haberNo;
    }

    public void setHaberNo(int haberNo) {
        this.haberNo = haberNo;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
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
    
    private int haberNo;
    private String baslik;
    private String aciklama;
    private Yazar yazar;

    public Haber(int haberNo, String baslik, String aciklama, Yazar yazar) {
        this.haberNo = haberNo;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.yazar = yazar;
    }
    
    

}
