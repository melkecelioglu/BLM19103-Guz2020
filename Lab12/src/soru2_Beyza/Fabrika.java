package Soru2;

import java.util.ArrayList;

/**
 *
 * @author ayza
 */
public class Fabrika {
    
    int ID;
    String ad;
    ArrayList<Personel>personelListesi=new ArrayList<>();
    
    public Fabrika(int ID,String ad){
        this.ID=ID;
        this.ad=ad;
        
    }
    
    
    public void personelEkle(Personel personel){
            personelListesi.add(personel);
        
    }
    public void YillikZamYap(){
        for (int i = 0; i < personelListesi.size(); i++) {
            if(personelListesi.get(i)!=null){
                personelListesi.get(i).ZamYap();
            }
        }
    }
    public void bilgileriYazdir(){
        for (int i = 0; i < personelListesi.size(); i++) {
            if(personelListesi.get(i)!=null){
                personelListesi.get(i).BilgiVer();
            }
        }
    }
    public void personelSay(){
        int stajyersayisi=0;
        int muhendissayisi=0;
        int iscisayisi=0;
        for (int i = 0; i < personelListesi.size(); i++) {
            if(personelListesi.get(i) instanceof Stajyer){
                stajyersayisi++;
            }
            if(personelListesi.get(i) instanceof Muhendis){
                muhendissayisi++;
            } 
            if(personelListesi.get(i) instanceof Isci){
                iscisayisi++;
            }           
        }
        System.out.println("Stajer sayisi: " + stajyersayisi);
        System.out.println("Muhendis sayisi: " + muhendissayisi);
        System.out.println("İsci sayisi: " + iscisayisi);
    }
}
