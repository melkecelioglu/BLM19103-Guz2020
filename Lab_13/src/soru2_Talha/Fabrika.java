
package soru2;

import java.util.ArrayList;

public class Fabrika {
    private int id;
    private String ad;
    private ArrayList<Personel> personelListesi;
    
    public Fabrika(String ad){
        this.ad = ad;
        this.personelListesi = new ArrayList<>();
    }
    
    public void personelEkle(Personel p){
        personelListesi.add(p);
    }
    
    public void yillikZamYap(){
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).zamHesapla();
        }
    }
    public void bilgileriYazdir(){
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).bilgileriYazdir();
        }
    }
    public int[] personelSay(){
        int[] personelSayisi = new int[3];
        for (int i = 0; i < personelListesi.size(); i++) {
            if(personelListesi.get(i) instanceof Muhendis)
                personelSayisi[0] += 1;
            else if(personelListesi.get(i) instanceof Isci)
                personelSayisi[1] += 1;
            else
                personelSayisi[2] += 1;
        }
        return personelSayisi;
    }
}
