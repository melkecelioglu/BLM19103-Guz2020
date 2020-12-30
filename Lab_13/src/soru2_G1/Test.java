
package Lab13;

public class Test {
    public static void main(String[] args) {
        
        Muhendis m1 = new Muhendis(1, "Ali A", 5000, 5, "Profesör");
        Muhendis m2 = new Muhendis(1, "dafsfssgsgg", 5000, 5, "Profesör");
        
        Isci i1 = new Isci(3, "Ayşe B", 3000, 3, "İşçi");
        Isci i2 = new Isci(4, "Burak C", 2500, 2, "İşçi");
        Isci i3 = new Isci(5, "Mustafa D", 2000, 1, "İşçi");
        
        Stajyer s1 = new Stajyer(6, "Ahmet E", 2000, 2, "Stajyer");
        Stajyer s2 = new Stajyer(7, "Elif F", 1500, 1, "Stajyer");
        Stajyer s3 = new Stajyer(8, "Murat G", 1000, 1, "Stajyer");
        
        m1.bilgileriYazdir();
        System.out.println("*****************");
        i2.bilgileriYazdir();
        System.out.println("*****************");
        s3.bilgileriYazdir();
        
        
        i3.bilgileriYazdir();
        i3.zamHesapla();
        System.out.println("*****************");
        i3.bilgileriYazdir();
        
        m1.personelEkle(m2);
        m1.personelEkle(i1);
        m1.personelEkle(i2);
        m1.personelEkle(s3);
        System.out.println("*-----------------------------------------------------");
        m1.bilgileriYazdir();

        Fabrika f1 = new Fabrika(123, "A Fabrikası");
        f1.personelEkle(i3);
        f1.bilgileriYazdir();
        
        f1.yillikZamYap();
        System.out.println("********************");
        f1.bilgileriYazdir();
        f1.personelSay();

        
        
        
    }
}
