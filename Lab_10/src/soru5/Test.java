
package soru5;

/**
 *
 * @author yakari
 */
public class Test {
    
    public static void main(String[] args) {
        Kullanici k1 = new Kullanici(1, "Ali", "Tatlıses", "tatli_ali");
        Kullanici k2 = new Kullanici(2, "Kemal", "Demir", "kemal_demir");
        Kullanici k3 = new Kullanici();
        Kullanici k4 = new Kullanici(3, "Sedat", "Yazıcı", "yazici_sedat");
        Kullanici k5 = new Kullanici(4, "Aslı", "Şahin", "asli_42");
        
        Konu konu1 = new Konu();
//        System.out.println(konu1.getBaslik());
//        System.out.println(konu1.getId());
        Konu konu2 = new Konu(2, "Ağ sızıntıları");
//        konu2.setBaslik("Encapculation in java");
//        System.out.println(konu2.getBaslik());
        
        Konu konu3 = new Konu(3, "Donanım");
        Konu konu4 = new Konu(4, "Yazılım geliştirme aşamaları");
        Konu konu5 = new Konu(5, "Netbeans kurulumu");
        
        Mesaj m1 = new Mesaj(k3);//check mesaj contructor
        Mesaj m2 = new Mesaj(2, "Bilgi güvenliği sistemlerinin temel amacı...", k2);
        Mesaj m3 = new Mesaj(3, "Bilgisayar donanımı.....", k3);//check k3
        Mesaj m4 = new Mesaj(4, "Analiz, Tasarım, Kodlama,Test...", k4);
        Mesaj m5 = new Mesaj(5, "İlk olarak JDK kurulması....", k5);
//        System.out.println(k1.getAd());
//        k1.setAd("İbrahim");
//        System.out.println(k1.getAd());
//        System.out.println(m1.getKarakterSayisi());
//        System.out.println(konu1.getBaslik());

        konu1.mesajEkle(m1);
        konu1.mesajEkle(m2);
        konu1.mesajEkle(m3);
        konu1.mesajEkle(m4);
        konu1.mesajEkle(m5);//4.indis
        konu1.mesajSil(m5);
        
        konu1.mesajListele();
        
    }
    
}
