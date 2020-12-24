package Soru2;

/**
 *
 * @author ayza
 */
public class Personel {

    int ID;
    String adSoyad;
    double maas;
    int calismaYili;
    String unvan;

    public Personel(int ID,String adSoyad,double maas,int calismaYili,String unvan) {
        this.ID=ID;
        this.adSoyad=adSoyad;
        this.calismaYili=calismaYili;
        this.maas=maas;
        this.unvan=unvan;                
    }

    public void ZamYap() {
        maas = maas + (maas * 15) / 100;
    }
    public void BilgiVer(){
        System.out.println("Id: "+this.ID);
        System.out.println("Ad Soyad: "+this.adSoyad);
        System.out.println("Maas: "+this.maas);
        System.out.println("Calisma Yili: "+this.calismaYili);
        System.out.println("Unvan: "+this.unvan);
    }
}
