package lab;

public class Muzik {

    private int id;
    private String isim;
    private Sanatci sanatci;

    public Muzik(int p_id, String p_isim, Sanatci p_sanatci) {
        id = p_id;
        isim = p_isim;
        sanatci = p_sanatci;
    }

    public void setId(int p_id) {
        id = p_id;
    }

    public int getId() {
        return id;
    }

    public void setIsim(String p_isim) {
        isim = p_isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setSanatci(Sanatci p_sanatci) {
        sanatci = p_sanatci;
    }

    public Sanatci getSanatci() {
        return sanatci;
    }

    public String getSanatciad() {
        String a = sanatci.getAd() + sanatci.getSoyad();
        return a;
    }
}
