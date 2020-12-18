package soru1;

/**
 *
 * @author Muhammet
 */
public class Test {

    public static void main(String[] args) {

        Ogrenci o1 = new Ogrenci(123, "Ahmet", "Beyaz");
        Ogrenci o2 = new Ogrenci(456, "Ayşe", "Siyah");
        
        Egitmen e1 = new Egitmen("Musa", "Aydın");
        Egitmen e2 = new Egitmen("Ali", "Nizam");
        
        Ders d1 = new Ders("BLM19103", "BP1", e1);
        Ders d2 = new Ders("BLM19104", "BP2", e2);
        
        e1.dersListele();
        
        o1.dersEkle(d1);
        o1.dersEkle(d2);
        o2.dersEkle(d1);
        
        d1.dersBilgisi();
    }
}
