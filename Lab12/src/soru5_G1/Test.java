package kalitim;

public class Test {

    public static void main(String[] args) {

        Fabrika f1 = new Fabrika(12, 2000);
    
        Kullanici k1 = new Kullanici("Ebrar Derindag");
        Kullanici k2 = new Kullanici("Ahmet Yılmaz");

        Otomobil oto1 = f1.otoUret("Peugeot", "2008", 150000, 130);
        Otomobil oto2 = f1.otoUret("Fiat", "Egea", 120000, 95);
        Otomobil oto3 = f1.otoUret("Opel", "Astra", 200000, 122);
        Otomobil oto4 = f1.otoUret("Volkswagen", "Passat", 250000, 135);
        Otomobil oto5 = f1.otoUret("Honda", "xx", 250000, 135);
        
        f1.OtoSayiListesi();

        f1.otoSat(k1, oto1);

        f1.otoSat(k2, oto2);
        k2.aracListele(k2.adSoyad);

        f1.otoSat(k1, oto3);
        k1.aracListele(k1.adSoyad);
        System.out.println("\nFabrikadaki Toplam Araç Sayısı= " + f1.otoListesi.size());

    }

}
