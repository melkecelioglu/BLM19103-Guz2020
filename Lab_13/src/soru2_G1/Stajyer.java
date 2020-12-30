
package Lab13;

public class Stajyer extends Personel implements IZamHesaplayici {
    
    public Stajyer(int id, String adSoyad, double maas, int calismaYili,String unvan){
        super(id, adSoyad, maas, calismaYili, unvan);
    }
    
    @Override
    void bilgileriYazdir() {
        System.out.println("Id:  " + super.getId());
        System.out.println("Ad Soyad: " + super.getAdSoyad());
        System.out.println("Maaş: " + super.getMaas());
        System.out.println("Çalışma Yılı: " + super.getCalismaYili());
        System.out.println("Unvan: " + super.getUnvan());
    }

    @Override
    public void zamHesapla() {
        setMaas(getMaas());
    }
    
}
