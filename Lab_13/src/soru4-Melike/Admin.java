package soru4;

import java.util.ArrayList;

/**
 *
 * @author melikekecelioglu
 */
public class Admin extends Kullanici implements IHaberIslemleri {

    public Admin(String adSoyad, String kullanici_adi, Gazete gazete) {
//        super(adSoyad, kullanici_adi, gazete);
        this.adSoyad=adSoyad;
        this.kullanici_adi=kullanici_adi;
        this.gazete=gazete;
    }

    

    protected ArrayList<Haber> haberListesi = new ArrayList<Haber>();

    void bilgileriYazdir() {
        System.out.println("");
        System.out.println("----Kullanici Bilgileri----");
        System.out.println("Admin ad soyad: " + adSoyad);
        System.out.println("Admin id: " + kullanici_adi);
        System.out.println("Gazete: " + gazete);
        System.out.println("-----------------------------------------");
        System.out.println("haber silidi...");
        System.out.println("güncelledigi bilgiler....");
    }

    public void haberEkle(Haber h) {
        for (int i = 0; i < haberListesi.size(); i++) {
            if (haberListesi.get(i) == null) {
                haberListesi.add(h);
            }
            else{
                System.out.println("Dolu...");
            }
        }

    }
    void haberSil(Haber h1){
        haberListesi.remove(h1);
    }
    void haberGuncelle(Haber h,String icerik){
            for(int i=0;i<haberListesi.size();i++){
                if(haberListesi.get(i)==h){
                    haberListesi.get(i).setAciklama(icerik);
                }
            }
        
    }

}
