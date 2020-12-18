/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feyza Kuruçay
 */
public class urun {
    private String id;
    private String ad;
    private String aciklama;
    private String kategori;
    private Firma firma;


   public void bilgiVer(String yeni_ad, String yeni_id, String yeni_aciklama, String yeni_kategori){
       
        System.out.println("Ürün adı: "+yeni_ad);
        System.out.println("Ürün id:  "+yeni_id);
        System.out.println("Ürün açıklama: "+yeni_aciklama);
        System.out.println("Ürün kategori: "+yeni_kategori);
    }

    public urun() {
    }

    public urun(String ad, String aciklama) {
        this.ad = ad;
        this.aciklama = aciklama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }
    
}
