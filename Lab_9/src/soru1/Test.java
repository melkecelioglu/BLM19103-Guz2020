
package soru1;

public class Test {
    
    public static void main(String[] args) {
        
        Personel personel_1 = new Personel("Ahmet", "Yılmaz", 3500, 2);
        Personel personel_2 = new Personel("Ayşe", "Yıldırım", 5600);
        
        personel_2.setCalisma_yili(3);
        
        System.out.println("Personel 1 Ad Soyad: " + personel_1.getAd() + " " + personel_1.getSoyad());
        System.out.println("Personel 1 Maaş: " + personel_1.getMaas());
        System.out.println("Personel 1 Çalışma Yılı: " + personel_1.getCalisma_yili());
        System.out.println("Personel 2 Ad Soyad: " + personel_2.getAd() + " " + personel_2.getSoyad());
        System.out.println("Personel 2 Maaş: " + personel_2.getMaas());
        System.out.println("Personel 2 Çalışma Yılı: " + personel_2.getCalisma_yili());
        
    }
}
