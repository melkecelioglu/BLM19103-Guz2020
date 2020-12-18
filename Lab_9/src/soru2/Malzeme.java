
public class Malzeme {
    
    int uretimNo;
    String ad;
    double fiyat;
    int stok;

    public Malzeme(int g_uretimNo, String g_ad, double g_fiyat, int g_stok) {
        uretimNo = g_uretimNo;
        ad = g_ad;
        fiyat = g_fiyat;
        stok = g_stok;
    }
    
    public void malzemeKullan(int miktar){
        if (stok >= miktar){
            stok = stok - miktar;
            System.out.println("Yeni Malzeme Miktarı:" + stok);
        }
        else{
            System.out.println("Yeterli Miktarda Malzeme Yok");
        }
    }
    
    public void bilgileriYazdir(){
        System.out.println("Üretim No: " + uretimNo + " - Ad: " + ad + " - Fiyat: " + fiyat + " - Stok: " + stok);
    }

    public String getAd() {
        return ad;
    }

    public int getStok() {
        return stok;
    }
    
    
    public double getFiyat() {
        return fiyat;
    }

    public int getUretimNo() {
        return uretimNo;
    }
 
}
