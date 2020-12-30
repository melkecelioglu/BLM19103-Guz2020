package soru4;

/**
 *
 * @author TR
 */
public class Haber {
    
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

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public String getBaslik() {
        return baslik;
    }

    public int getHaberNo() {
        return haberNo;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getAciklama() {
        return aciklama;
    }
    
    
    
    

    
    
    
    
}
