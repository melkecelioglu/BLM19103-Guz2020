
package soru5;

/**
 *
 * @author yakari
 */
public class Mesaj {
    private int id;
    private String metin;
    private int karakterSayisi;
    private Kullanici kullanici;
    
    public Mesaj(){
       this(0, null,null);
       //this(id, metin, kullanici);
    }
    public Mesaj(Kullanici kullanici){
    this.kullanici=kullanici;
    }

    public Mesaj(int id, String metin, Kullanici kullanici) {
        this.id = id;
        this.metin = metin;
        this.karakterSayisi = metin.length();
        this.kullanici = kullanici;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetin() {
        return metin;
    }

    public void setMetin(String metin) {
        this.metin = metin;
    }

    public int getKarakterSayisi() {
        return karakterSayisi;
    }

    public void setKarakterSayisi(int karakterSayisi) {
        this.karakterSayisi = karakterSayisi;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
    
    
}
