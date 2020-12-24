
public class Test {

    public static void main(String[] args) {
        Fabrika f1 = new Fabrika(2020, "Software");
        Personel p1 = new Personel(1, "Mehmet Özkan", 1000, 7, "Junior");
        Personel p2 = new Personel(2, "Ahmet Engin", 1500, 5, "Senior");
        Muhendis m1 = new Muhendis(21, "Kemal Boratan", 2500, 1, "Junior");
        Muhendis m2 = new Muhendis(22, "Ali Kemal", 2000, 1, "Junior");
        Isci i1 = new Isci(41, "Murat Dege", 500, 4, "Senior");
        Isci i2 = new Isci(42, "Enes Tolga", 400, 2, "Junior");
        Stajyer s1 = new Stajyer(51, "Emirhan Eren", 750, 1, "Junior");
        Stajyer s2 = new Stajyer(52, "Akif Erlik", 800, 3, "Senior");

        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(m1);
        f1.personelEkle(m2);
        f1.personelEkle(i1);
        // f1.personelEkle(i2);
        f1.personelEkle(s1);
        f1.personelEkle(s2);
        System.out.println("****** Zam Sonrası ******");
        p1.zamYap();
        m1.zamYap();
        i1.zamYap();
        s1.zamYap();
        System.out.println("");
        f1.yillikZamYap();
        System.out.println("");
        f1.bilgileriYazdir();
        System.out.println("");
        System.out.println(f1.personelSay());

    }
}
