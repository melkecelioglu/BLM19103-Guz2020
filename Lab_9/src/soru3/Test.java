package soru3;

public class Test {
    
    public static void main(String[] args) {
        
        Fabrika fabrika = new Fabrika("A", 10);
        
        Malzeme vida = new Malzeme(123, "Vida", 0.5, 10);
        //vida.malzemeKullan(11);
        
        Malzeme ayna = new Malzeme(1234, "Ayna", 5, 6);
        Malzeme civi = new Malzeme(1235, "Çivi", 1, 50);
        Malzeme cekic = new Malzeme(1234, "Çekiç", 10, 20);
        
        fabrika.malzemeEkle(vida);
        fabrika.malzemeEkle(ayna);
        fabrika.malzemeEkle(civi);
        fabrika.malzemeEkle(cekic);
        
        System.out.println("Fabrika Malzeme Miktarı: " + fabrika.getMevcutMalzemeMiktari());
        
        fabrika.malzemeSil(1234);
        
        fabrika.malzemeListesiYazdir();
        fabrika.malzemeEkle(ayna);
        fabrika.malzemeListesiYazdir();
        
        
    }
    
}
