package soru2;

public class Isci extends Personel implements IZamHesaplayici {

    public Isci(int id, String adSoyad, int maas, int calısmaYılı, String unvan) {
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
        try {
            if (getMaas() * 1.15 < 20000) {
                setMaas(getMaas() * 1.2);

            } else if (getMaas() * 1.15 >= 20000) {
                setMaas(20000);
                throw new SinirKontrol();

            }
        } catch (SinirKontrol e) {
            System.out.println(e);
        }
    }

}
