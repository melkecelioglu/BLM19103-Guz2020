package Soru6;
import java.util.ArrayList;
/**
 *
 * @author ayza
 */
public class Kullanici {
    String adSoyad;
    ArrayList<Urun>urunListesi=new ArrayList<>();

    public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;       
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
