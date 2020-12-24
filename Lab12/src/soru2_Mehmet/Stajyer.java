
public class Stajyer extends Personel {

    public Stajyer(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }

    @Override
    public void zamYap() {
        int guncel_maas;
        guncel_maas = getMaas();
        System.out.println("Stajyer " + getAdSoyad() + " Maaş : " + guncel_maas + " TL");
    }

}
