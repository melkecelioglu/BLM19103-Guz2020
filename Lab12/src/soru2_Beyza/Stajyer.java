package Soru2;

/**
 *
 * @author ayza
 */
public class Stajyer extends Personel {

    public Stajyer(int ID, String adSoyad, double maas, int calismaYili, String unvan) {
        super(ID, adSoyad, maas, calismaYili, unvan);
    }

    @Override
    public void ZamYap() {
        maas = maas;
    }
}
