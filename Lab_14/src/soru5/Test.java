package lab_14;

/**
 *
 * @author Erdinc
 */
public class Test {

    public static void main(String[] args) {
        Fabrika fabrika = new Fabrika(123, 1990);

        Kullanici kullanici1 = new Kullanici("Erdinc Kuvvet");
        Kullanici kullanici2 = new Kullanici("Ahmet Yilmaz");

        Otomobil arac1 = fabrika.otoUret("Renault", "Clio", 0, 90000);
        Otomobil arac2 = fabrika.otoUret("Fiat", "Linea", 90, 80000);
        Otomobil arac3 = fabrika.otoUret("Seat", "Leon", 100, 150000);
        Otomobil arac4 = fabrika.otoUret("Volkswagen", "Golf", 140, 180000);
        Otomobil arac5 = fabrika.otoUret("Skoda", "Superb", 150, 200000);

        fabrika.otoSat(kullanici1, arac1);

        fabrika.otoSat(kullanici2, arac2);

        fabrika.otoSat(kullanici1, arac1);
        
        fabrika.otoSat(kullanici1, arac3);

        fabrika.otoSat(kullanici2, arac4);

        fabrika.otoSat(kullanici2, arac5);

        arac1.bilgileriYazdir();
        arac2.bilgileriYazdir();
        arac3.bilgileriYazdir();
        arac4.bilgileriYazdir();
        arac5.bilgileriYazdir();
        
        fabrika.modifiyeEt(arac1);
        fabrika.modifiyeEt(arac3);
        fabrika.modifiyeEt(arac4);
        
        arac1.bilgileriYazdir();
        arac3.bilgileriYazdir();
        arac4.bilgileriYazdir();
        


    }

}
