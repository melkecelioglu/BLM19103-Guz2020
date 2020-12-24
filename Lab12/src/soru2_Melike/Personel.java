/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

/**
 *
 * @author melikekecelioglu
 */
public class Personel {
    private int id;
    private String adSoyad;
    private double maas;
    private int calismaYili;
    private String unvan;
    
    public Personel(){
    }
    
    public Personel(int id, String adSoyad, double maas, int calismaYili, String unvan){
    this.id=id;
    this.adSoyad=adSoyad;
    this.maas=maas;
    this.calismaYili=calismaYili;
    this.unvan=unvan;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public int getCalismaYili() {
        return calismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        this.calismaYili = calismaYili;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    @Override
    public String toString(){
        return "Ad Soyad = "+adSoyad+" Unvanı = "+getUnvan()+" Çalışma Yılı = "+getCalismaYili();
    }


    public void zamYap() {
      
        maas=maas*1.15;
    }

    public void bilgiVer() {
        
        System.out.println("Personel id = " + id);
        System.out.println("Personel ad soyad = " + adSoyad);
        System.out.println("Personel maaşı = " + maas);
        System.out.println("Personel çalışma yılı = " + calismaYili);
        System.out.println("Personel ünvanı =" + unvan);
    }
    
}
