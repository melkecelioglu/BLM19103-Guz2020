package Soru6;

import java.util.ArrayList;

/**
 *
 * @author ayza
 */
public class Sepet {

    Kullanici sepetSahibi;
    ArrayList<Urun> urunListesi = new ArrayList<>();

    public Sepet(Kullanici sepetSahibi) {
        this.sepetSahibi = sepetSahibi;
    }

    public void UrunEkle(Urun urun) {
        urunListesi.add(urun);
    }

    public void satinAl() {
        for (int i = 0; i < urunListesi.size(); i++) {
                sepetSahibi.urunListesi.add(urunListesi.get(i));
                urunListesi.remove(urunListesi.get(i));
        }
    }
    public void UrunListele(){
        for (int i = 0; i < urunListesi.size(); i++) {
            if(urunListesi.get(i)!=null){
                System.out.println("Urunun adi: "+urunListesi.get(i).ad);
                System.out.println("Urunun kategorisi:"+urunListesi.get(i).kategori);
                System.out.println("Urunun fiyati:"+urunListesi.get(i).fiyat);
            }else{
                System.out.println("Urun yok.");
            }
        }
    }
}
