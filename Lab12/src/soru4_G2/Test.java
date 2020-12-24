package kullanici;

public class Test {

    public static void main(String[] args) {
        Kullanici ahmet = new Ogrenci("Ahmet", 16, 34235252, 45.75);
        Kullanici mehmet = new Emekli("Mehmet", 60, 2452354, 40.20);
        Film c = new Film(252535, "Ayla", "Dram", 12);
        Film e = new Film(324253,"Interstellar","Bilim Kurgu", 50);
        Seans b = new Seans(1241413, c, 17);
        Seans a = new Seans(1213244, e, 12);
        Sinema d = new Sinema(ahmet, b);

        ahmet.bilgiVer();
        d.biletSat(ahmet, b);
        ahmet.bilgiVer();
        d.biletSat(ahmet,a);
        mehmet.bilgiVer();
        d.biletSat(mehmet, b);
        mehmet.bilgiVer();
         
    }
}
