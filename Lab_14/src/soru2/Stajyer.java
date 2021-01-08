package soru2;

public class Stajyer extends Personel implements IZamHesaplayici {

    public Stajyer(int id, String adSoyad, int maas, int calısmaYılı, String unvan) {
        super(id, adSoyad, maas, calısmaYılı, unvan);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("id: " + super.getId());
        System.out.println("adSoyad: " + super.getAdSoyad());
        System.out.println("maas: " + super.getMaas());
        System.out.println("calısma yılı: " + super.getCalismaYili());
        System.out.println("unvan: " + super.getUnvan());

    }

    @Override
    public void zamHesapla() {
        
    }

}
