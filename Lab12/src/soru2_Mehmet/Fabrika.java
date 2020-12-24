
import java.util.ArrayList;

public class Fabrika {

    private int id;
    private String ad;
    private ArrayList<Personel> personelListesi;

    public Fabrika(int id, String ad) {
        this.id = id;
        this.ad = ad;
        this.personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public void yillikZamYap() {
        System.out.println("****** Yıllık Zam Sonrası ******");
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).zamYap();

        }
    }

    public void bilgileriYazdir() {
        System.out.println("****** Tüm Personellerin Bilgileri ******");
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).bilgiVer();
            System.out.println("");
        }
    }

    public ArrayList<Integer> personelSay() {
        System.out.println("****** Personel Sayısı ******");
        ArrayList<Integer> personelSayiListesi = new ArrayList<Integer>();
        int muhendisSayisi = 0;
        int isciSayisi = 0;
        int stajyerSayisi = 0;
        for (int i = 0; i < personelListesi.size(); i++) {
            if (personelListesi.get(i) instanceof Muhendis) {
                muhendisSayisi++;
            }
            if (personelListesi.get(i) instanceof Isci) {
                isciSayisi++;
            }
            if (personelListesi.get(i) instanceof Stajyer) {
                stajyerSayisi++;
            }
        }
        personelSayiListesi.add(muhendisSayisi);
        personelSayiListesi.add(isciSayisi);
        personelSayiListesi.add(stajyerSayisi);
        
        return personelSayiListesi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public ArrayList<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public void setPersonelListesi(ArrayList<Personel> personelListesi) {
        this.personelListesi = personelListesi;
    }

}
