package soru1;

public class Main {

    public static void main(String[] args) {

        Fabrika fbrk = new Fabrika(12345, "A Fabrika"); // id: 12345, isim: A Fabrika
        
        Uretici u1 = new Uretici(321, "Tofaş", "Türkiye"); // id: 321, ad: Tofaş, ulke: Türkiye
        Uretici u2 = new Uretici(322, "TOGG", "Türkiye");
        
        Araba a1 = new Araba(123, "Şahin", "10/06/1990"); // id: 123, model: Şahin, uretim_tarihi: 10/06/1990
        a1.setUretici(u1);
        Araba a2 = new Araba(124, "TOGG Suv", "10/06/2022"); 
        a2.setUretici(u2);
        
        fbrk.arabaEkle(a1);
        fbrk.arabaEkle(a2);
        
        // Düzenleme Metotlarımızı Çağırıyoruz.
        for (int i = 0; i < fbrk.getArabaListesi().size(); i++) {
            Araba araba = fbrk.getArabaListesi().get(i); // Araba listesindeki i. araba objesini al 
            int[] gun_ay_yil = fbrk.split(araba.getUretim_tarihi()); // [10, 06, 1990] 
            araba.setGun(gun_ay_yil[0]);
            araba.setAy(gun_ay_yil[1]);
            araba.setYil(gun_ay_yil[2]);
            araba.bilgiVer(); // Çıktı: "Id: 123, model: Şahin, üretici adı: Tofaş, gün: 10, ay: 06, yil: 1990"

        }

    }

}
