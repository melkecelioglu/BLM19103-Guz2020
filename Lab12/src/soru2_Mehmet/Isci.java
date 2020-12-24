
public class Isci extends Personel {

    public Isci(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }

    @Override
    public void zamYap() {
        int guncel_maas;
        guncel_maas = (getMaas() * 115) / 100;
        System.out.println("İşçi " + getAdSoyad() + " Maaş : " + guncel_maas + " TL");
    }
}
