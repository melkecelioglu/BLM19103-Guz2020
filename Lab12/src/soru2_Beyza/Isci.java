package Soru2;

/**
 *
 * @author ayza
 */
public class Isci extends Personel {

    public Isci(int ID, String adSoyad, double maas, int calismaYili, String unvan) {
        super(ID, adSoyad, maas, calismaYili, unvan);
    }
    @Override
    public void ZamYap() {
        maas = maas + (maas * 15) / 100;
    }

}
