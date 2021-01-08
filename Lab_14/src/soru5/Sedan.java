
package lab_14;

/**
 *
 * @author Erdinc
 */
public class Sedan extends Otomobil implements IModifiyeIslemleri,IsatisIslemleri{
    
    private String[]ozellikListesi = new String[2];
    
    
    public Sedan(String marka, String model, int beygirGucu, double satisFiyati) {
        super(marka, model, beygirGucu, satisFiyati);
       // satisFiyatiHesapla();
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("\n****OTOMOBİL BİLGİLERİ****");
        System.out.println("Marka: "+getMarka());
        System.out.println("Model: "+getModel());
        System.out.println("Beygir Gücü: "+getBeygirGucu());
        System.out.println("Satış Fiyatı: "+getSatisFiyati());
        System.out.println("Kullanıcı: "+ getKullanici().getAdSoyad());
        System.out.print("Özellikler: ");
        for (int i = 0; i < ozellikListesi.length; i++) {
            if (ozellikListesi[i] != null) {
                System.out.print("* "+ozellikListesi[i] + " ");
            }
            
        }
        System.out.println();
  
    }

    @Override
    public void navigasyonEkle() {
         for (int i = 0; i < ozellikListesi.length; i++) {
                if (ozellikListesi[i] == null) {
                    ozellikListesi[i] = "Navigasyon";
                    break;    
                }
            }
    setSatisFiyati(getSatisFiyati()+2500);
    }

    @Override
    public void parkSensoruEkle() {
        for (int i = 0; i < ozellikListesi.length; i++) {
                if (ozellikListesi[i] == null) {
                    ozellikListesi[i] = "Park Sensörü";
                    break;    
                }
            }  
        setSatisFiyati(getSatisFiyati() + 1200);
    }

    @Override
    public void satisFiyatiHesapla() {
        try{
            if (getBeygirGucu() == 0)
                throw new FiyatKontrol("Fiyat Kontrol Hatası");
            setSatisFiyati(getSatisFiyati()+getSatisFiyati()* 0.15 + (4*getBeygirGucu()));
        } catch(FiyatKontrol e) {
            System.out.println("HATA: "+ e);
        }finally{
            setBeygirGucu(1500);
            setSatisFiyati(getSatisFiyati()+getSatisFiyati()* 0.15 + (4*getBeygirGucu()));
        }
    }
    
    
 
}
