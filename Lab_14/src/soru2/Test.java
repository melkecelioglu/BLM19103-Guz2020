package soru2;

public class Test {

    public static void main(String[] args) throws BoyutTasmaHatasi, NullElemanKontrol, SinirKontrol {
        // TODO code application logic here

        Muhendis p1 = new Muhendis(123, "Furkan Selim Salihoğlu", 16000, 3, "unvan1");
        Isci p2 = new Isci(124, "Yasir Ucarat", 10000, 2, "yüzbaşı");
        Stajyer p3 = new Stajyer(125, "Cüneyt Söylemez", 2000, 1, "er");

        Fabrika f1 = new Fabrika("Mehmet Bey Fabrikalari");

        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(p2);
        f1.personelEkle(p2);
        f1.personelEkle(p2);
        f1.personelEkle(p3);
        f1.personelEkle(p3);
        f1.personelEkle(p3);
        f1.personelEkle(p3);
        f1.personelEkle(p2);
        f1.personelEkle(p3);
        f1.personelEkle(p3);
        f1.personelEkle(p2);
        f1.personelEkle(p3);

        f1.yillikZamYap();
        //       System.out.println(p1.getMaas());

        p1.zamHesapla();
        //       System.out.println(p1.getMaas());
        p1.personelEkle(p3);
        p1.personelEkle(p2);
        p1.personelEkle(p3);
        p1.personelEkle(p2);
        p1.personelEkle(p3);
        p1.personelEkle(p2);
        p1.personelEkle(p3);
        p1.personelEkle(p2);

        // p3.zamHesapla();
        //System.out.println(p3.getMaas());
        // p2.zamHesapla();
        //System.out.println(p2.getMaas());
        // p1.bilgileriYazdir();
        int[] personeller = f1.personelSay();
        System.out.println("Muhendis: " + personeller[0]);
        System.out.println("Isci: " + personeller[1]);
        System.out.println("Stajyer: " + personeller[2]);
        f1.bilgileriYazdir();

    }
}
