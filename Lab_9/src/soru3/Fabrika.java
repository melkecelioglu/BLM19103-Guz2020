package soru3;

public class Fabrika {
    String ad;
    String[] malzemeListesi;
    int mevcutMalzemeMiktari;
    int maksMalzemeMiktari;
    
    public Fabrika(String g_ad, int g_maksMalzemeMiktarı) {
        ad = g_ad;
        maksMalzemeMiktari = g_maksMalzemeMiktarı;
        malzemeListesi = new String[g_maksMalzemeMiktarı];
    }
    
    public void malzemeEkle(Malzeme malzeme){
        if (mevcutMalzemeMiktari < maksMalzemeMiktari){
            malzemeListesi[mevcutMalzemeMiktari] = malzeme.stringeCevir();
            mevcutMalzemeMiktari++;
            System.out.println(malzeme.getAd() + " Listeye Eklendi!");
        } else {
            System.out.println("Malzeme Listesi Dolu!");
        }
        
    }
    
    public void malzemeSil(int g_uretimNo){
        int silinenMalzemeIndex = 0;
        
        for(int i = 0; i < mevcutMalzemeMiktari; i++){
            
            String[] malzemeBilgileri = malzemeListesi[i].split(" ");
            
            String malzemeAd = malzemeBilgileri[1];
            int malzemeUretimNo = Integer.parseInt(malzemeBilgileri[0]);
            
            if (malzemeUretimNo == g_uretimNo){
                silinenMalzemeIndex = i;
                mevcutMalzemeMiktari--;
                System.out.println(malzemeAd + " Silindi!");
                break;
            }
        }
        
        listeyiKaydir(silinenMalzemeIndex);
    }
    
    public void listeyiKaydir(int index){
        for (int i = index; i < mevcutMalzemeMiktari; i++) {
            malzemeListesi[i] = malzemeListesi[i + 1];
        }
    }

    public int getMevcutMalzemeMiktari() {
        return mevcutMalzemeMiktari;
    }
    
    public void malzemeListesiYazdir(){
        System.out.println("...Fabrika Malzeme Listesi...");
        for (int i = 0; i < mevcutMalzemeMiktari; i++) {
            String malzemeAdi = malzemeListesi[i].split(" ")[1];
            System.out.println(malzemeAdi);
        }
      
    }
    
    
    
}
