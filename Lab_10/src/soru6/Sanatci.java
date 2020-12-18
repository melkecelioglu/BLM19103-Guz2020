package lab;

public class Sanatci {

    private int id;
    private String ad;
    private String soyad;

    public Sanatci(int p_id, String p_ad, String p_soyad) {
        id = p_id;
        ad = p_ad;
        soyad = p_soyad;
    }

    public void setId(int p_id) {
        id = p_id;
    }

    public int getId() {
        return id;
    }

    public void setAd(String p_ad) {
        ad = p_ad;
    }

    public String getAd() {
        return ad;
    }

    public void setSoyad(String p_soyad) {
        soyad = p_soyad;
    }

    public String getSoyad() {
        return soyad;
    }
}
