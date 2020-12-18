/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feyza Kuruçay
 */
public class Magaza {
    private String ad;
    private urun[] UrunListesi;
    private int urun_sayısı;
    
    public Magaza (String ad1, int urun_sayısı){
        ad = ad1;
        UrunListesi = new urun[urun_sayısı];
        
    }
     public void urunEkle(urun urun) {
        for (int i = 0; i < getUrunListesi().length; i++) {
            if (getUrunListesi()[i] == null) {
                getUrunListesi()[i] = urun;
                break;
            }
        } urun_sayısı++;  
        if(urun_sayısı>getUrunListesi().length){
            System.out.println("En fazla "+ getUrunListesi().length + " tane urun girebilirsiniz...");
        }
    }
    
     public int indeksBul(String str, char chr){
        int index =0;
        for(int i = 0;i<str.length();i++){
           if(str.charAt(i)==chr){
               index = i;
               break;
           }
        }

        return index;
    }
    public String substring(String str, int index){
        String id = "";
        for(int i = index+1;i<str.length();i++){
            int karakter = str.charAt(i);
            id += (char)str.charAt(i);
        }

        return id;
    }
    public String substring(String str,int index,int adet){
       String id ="";
        for(int i = index+1;i<index+2+adet;i++){
            int karakter = str.charAt(i);
            id += (char)str.charAt(i);
        }
        return id;
        
    }

    

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the urunListesi
     */
    public urun[] getUrunListesi() {
        return UrunListesi;
    }

  
   
    public void setUrunListesi(urun[] urunListesi) {
        this.UrunListesi = urunListesi;
    }

    

    
    
}
