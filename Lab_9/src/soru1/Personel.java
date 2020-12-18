
package soru1;

public class Personel {
    
    String ad;
    String soyad;
    int maas;
    int calisma_yili;

    
    public Personel(String g_ad, String g_soyad, int g_maas, int g_calisma_yili){
        ad = g_ad;
        soyad = g_soyad;
        maas = g_maas;
        calisma_yili = g_calisma_yili;
    }
    
    public Personel(String g_ad, String g_soyad, int g_maas){
        ad = g_ad;
        soyad = g_soyad;
        maas = g_maas;
    }
    
    public void setAd(String g_ad) {
        ad = g_ad;
    }

    public void setSoyad(String g_soyad) {
        soyad = g_soyad;
    }

    public void setMaas(int g_maas) {
        maas = g_maas;
    }

    public void setCalisma_yili(int g_calisma_yili) {
        calisma_yili = g_calisma_yili;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getCalisma_yili() {
        return calisma_yili;
    }
    
    
    public int getMaas() {
        return maas;
    }
    
    
    
}
