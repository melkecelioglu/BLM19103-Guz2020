
public class Muhendis extends Personel {

    public Muhendis(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }

    @Override
    public void zamYap() {
        int guncel_maas;
        guncel_maas = (getMaas() * 120) / 100;
        System.out.println("Muhendis " + getAdSoyad() + " Maaş : " + guncel_maas + " TL");

    }

}
