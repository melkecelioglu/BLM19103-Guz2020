package Soru3;
public class Emekli extends Kullanici implements IOdemeIslemleri, IBiletIslemleri{
    
    private int kartOdeme = 0;
    private int nakitOdeme = 0;
    
    public Emekli(String adSoyad, int yas, long tcNo, double bakiye){
        super(adSoyad, yas, tcNo, bakiye);
    }
    
    @Override
    public void bilgileriYazdir(){
        System.out.println("Kullanici Ad Soyad: "+getAdSoyad()+"  Yas: "+getYas()
                                +"  Tc No: "+getTcNo()+"  Bakiye: "+getBakiye()+
                                "\nBiletler:");
        for(int i=0; i<getSeansListesi().length; i++){
            if(getSeansListesi()[i] != null){
                System.out.println("ID:"+getSeansListesi()[i].getId()+"  Film: "+
                        getSeansListesi()[i].getFilm().getAd()+"  Seans saati: "+
                        getSeansListesi()[i].getSeansSaati());
            }
        }
        System.out.println("Kart ödeme sayısı:"+kartOdeme+"\nNakit ödeme sayısı:"+nakitOdeme);
    }
    
    @Override
    public void satinAl(Seans s){
        for(int i=0; i<getSeansListesi().length; i++){
            if(getSeansListesi()[i] == null){
                getSeansListesi()[i] = s;
                setBakiye(getBakiye() - s.getFilm().getUcret()*85/100);
                System.out.println(s.getFilm().getAd() + " filmi eklendi");
                break;
            }
        }
    }
    
    @Override
    public void kartOdeme(Seans s){
        if (getBakiye() >= s.getFilm().getUcret()*85/100){
            satinAl(s);
            kartOdeme++;
        }
        else
            System.out.println("Yetersiz bakiye");
    }
    
    @Override
    public void nakitOdeme(Seans s){
        if (getBakiye() >= s.getFilm().getUcret()*85/100){
            satinAl(s);
            setBakiye(getBakiye() + s.getFilm().getUcret()*1/100);
            nakitOdeme++;
        }
            
        else
            System.out.println("Yetersiz bakiye");
    }
}
