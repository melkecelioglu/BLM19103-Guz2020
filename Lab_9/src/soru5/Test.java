package soru5;

public class Test {

    public static void main(String[] args) {

        Egitmen egitmen_1 = new Egitmen("Musa", "Aydın");
        Egitmen egitmen_2 = new Egitmen("Ali", "Nizam");

        Ders bp1 = new Ders(19103, "BP101", egitmen_1);
        Ders bp2 = new Ders(19104, "BP102", egitmen_2);

        Ogrenci ogr_1 = new Ogrenci(101, "Ahmet", "Yılmaz");
        Ogrenci ogr_2 = new Ogrenci(102, "Ayşe", "Yıldız");
        Ogrenci ogr_3 = new Ogrenci(103, "Mehmet", "Emin");
        Ogrenci ogr_4 = new Ogrenci(104, "Yaren", "Akar");
        Ogrenci ogr_5 = new Ogrenci(105, "Bilal", "Şen");

        ogr_1.dersEkle(bp1);
        ogr_1.dersEkle(bp2);

        ogr_2.dersEkle(bp1);
        ogr_3.dersEkle(bp1);
        ogr_4.dersEkle(bp2);

        ogr_5.dersEkle(bp1);
        ogr_5.dersEkle(bp2);

        ogr_1.dersListele();
        ogr_2.dersListele();
        ogr_3.dersListele();
        ogr_4.dersListele();
        ogr_5.dersListele();

//        egitmen_1.dersListele();
        //      egitmen_2.dersListele();
        bp1.dersBilgisi();
        bp2.dersBilgisi();

    }
}
