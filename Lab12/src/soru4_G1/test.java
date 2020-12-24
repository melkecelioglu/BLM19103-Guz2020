
package kullanıcı;

/**
 *
 * @author melikekecelioglu
 */
public class test {

    public static void main(String[] args) {
        Emekli e = new Emekli("Hakan Kılıçdaroğlu",72,"12345678910",150);
        Emekli e1=new Emekli("Hüseyin Yıldırım",80,"389556386",30);
        Film film = new Film(" Y-17 " , " Yıldızlararası " , " Bilim Kurgu ", 40);
        Film film2=new Film(" E-13 " , " Hobbit " , " Macera/Fantastik " , 70);
        Ogrenci k = new Ogrenci("Dogukan Ozhan",27,"35467856577",900);
        Kullanıcı k2=new Kullanıcı("Mehmet Ata",40,"1921928401",50);
        Ogrenci o = new Ogrenci("Melike KECELIOGLU",19,"16372849203",0);
        Seans s = new Seans("100",17,film);
        Seans s1 = new Seans("200",10,film2);
        
        Sinema sinema = new Sinema("Maximum Sinemasi");
        System.out.println(sinema.getAd()+" 'na hosgeldiniz....");
        System.out.println("---------------------");
        
        e.bilgiVer();
        sinema.biletSat(e, s);
        e.bilgiVer();
        System.out.println("---------------------");
        
        System.out.println("Indirimsiz hali odencek tutar: "+film.getUcret());
        System.out.println("---------------------");
        e.bilgiVer();
        System.out.println("---------------------");
        o.bilgiVer();
        System.out.println("---------------------");
        o.biletSatinAl(s);
        System.out.println("---------------------");
        o.bilgiVer();
        System.out.println("---------------------");
        
        k.bilgiVer();
        k.biletSatinAl(s1);
        System.out.println("---------------------");
        k.bilgiVer();
        
        
        
        
        
        
        
    }

}
