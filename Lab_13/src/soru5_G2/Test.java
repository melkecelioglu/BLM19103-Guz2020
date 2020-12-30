package Soru5;

public class Test {
    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika(22, 1946);
        Kullanici kullanici1 = new Kullanici("Ömer Kerem");
        Kullanici kullanici2 = new Kullanici("Kerem Adalı");
        Sedan sedan1 = new Sedan("BMW", "2000", 4000, 80000, kullanici1);
        Sedan sedan2 = new Sedan("BMW", "2000", 4000, 80000, kullanici1);
        Suv suv1 = new Suv("Renault", "2001", 3000, 50000, kullanici2);
        
        suv1.bilgileriYazdir();
        System.out.println("");
        suv1.satisFiyatiHesapla();
        suv1.bilgileriYazdir();
        System.out.println("-------------");
        sedan1.bilgileriYazdir();
        System.out.println("");
        sedan1.navigasyonEkle();
        sedan1.parkSensoruEkle();
        sedan1.bilgileriYazdir();
        sedan1.navigasyonEkle();
        System.out.println("-------------");
        System.out.println(kullanici1.getAracListesi());
        Otomobil oto1 = fabrika.otoUret("Renault","2004", 3000, 50000);
        Otomobil oto2 = fabrika.otoUret("Renault","2004", 3000, 50000); 
        Otomobil oto3 = fabrika.otoUret("Renault","2004", 3000, 50000); 
        Otomobil oto4 = fabrika.otoUret("Renault","2004", 3000, 50000); 
        System.out.println(fabrika.getOtoListesi().get(0).getSatisFiyati());
        System.out.println(fabrika.getOtoListesi());
        System.out.println("-------------");
        fabrika.otoSat(kullanici1,oto1);
        System.out.println(fabrika.getOtoListesi());
        System.out.println(kullanici1.getAracListesi());
        System.out.println("-------------");
        fabrika.modifiyeEt(suv1);
        sedan2.bilgileriYazdir();
        System.out.println("");
        fabrika.modifiyeEt(sedan2);
        sedan2.bilgileriYazdir();    
    } 
}
