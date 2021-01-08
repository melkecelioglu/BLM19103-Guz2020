package Soru3;
public abstract class Kullanici {
    
    private String adSoyad;
    private int yas;
    private long tcNo;
    private double bakiye;
    private Seans [] seansListesi;
    
    protected Kullanici(String adSoyad, int yas, long tcNo, double bakiye){
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.tcNo = tcNo;
        this.bakiye = bakiye;
        this.seansListesi  = new Seans[5];
    }
    
    public abstract void bilgileriYazdir();
    
    public abstract void nakitOdeme(Seans s);
    
    public abstract void kartOdeme(Seans s);
    
    public void setAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public String getAdSoyad(){
        return adSoyad;
    }
    
    public void setYas(int yas){
        this.yas = yas;
    }
    public int getYas(){
        return  yas;
    }
    
    public void setTcNo(long tcNo){
        this.tcNo = tcNo;
    }
    public long getTcNo(){
        return tcNo;
    }

    public void setBakiye(double bakiye){
        this.bakiye = bakiye;
    }
    public double getBakiye(){
        return bakiye;
    }
    
    public Seans[] getSeansListesi(){
        return seansListesi;
    }
}
