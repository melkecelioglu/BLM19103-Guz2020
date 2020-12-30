    
package soru4;

public class Haber {
    private int haberNo;
    private String baslik;
    private Yazar yazar;
    
    public Haber(int haberNo, String baslik, Yazar yazar){
        this.haberNo = haberNo;
        this.baslik = baslik;
        this.yazar = yazar;
    }

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

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}
