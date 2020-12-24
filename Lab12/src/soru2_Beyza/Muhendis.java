package Soru2;

/**
 *
 * @author ayza
 */
public class Muhendis extends Personel{

    public Muhendis(int ID, String adSoyad, double maas, int calismaYili, String unvan) {
        super(ID, adSoyad, maas, calismaYili, unvan);
    }
    
    
    @Override
    public void ZamYap(){
        maas=maas + (maas * 20) / 100;
    }

}
