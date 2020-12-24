package Soru2;

/**
 *
 * @author ayza
 */
public class Test {

    public static void main(String[] args) {

        Fabrika fabrika=new Fabrika(1234,"Yildiz");
        Stajyer stajyer1 = new Stajyer(24, "aliAta", 4000, 1, "Stajyer");
        Muhendis muhendis1 = new Muhendis(55, "omerYilmaz", 6000, 1, "Muhendis");
        Isci isci1 = new Isci(78, "ahmetYildiz", 4500, 3, "Isci");
        
        muhendis1.ZamYap();
        muhendis1.BilgiVer();
        System.out.println("");
        stajyer1.ZamYap();
        stajyer1.BilgiVer();
        System.out.println("");
        isci1.ZamYap();
        isci1.BilgiVer();
        System.out.println("");
        
        fabrika.personelEkle(isci1);
        fabrika.personelEkle(stajyer1);
        fabrika.personelEkle(muhendis1);
        fabrika.personelSay();
        
        

    }
}
