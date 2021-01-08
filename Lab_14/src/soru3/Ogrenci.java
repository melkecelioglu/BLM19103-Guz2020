package Soru3;
public class Ogrenci extends Kullanici implements IOdemeIslemleri, IBiletIslemleri{
    
    public Ogrenci(String adSoyad, int yas, long tcNo, double bakiye){
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
    }
    
    @Override
    public void satinAl(Seans s){
        boolean kontrol = true;
        
        for(int i=0; i<getSeansListesi().length; i++){
            if(getSeansListesi()[i] == null){
                getSeansListesi()[i] = s;
                setBakiye(getBakiye() - s.getFilm().getUcret()*8/10);
                System.out.println(s.getFilm().getAd() + " filmi eklendi");
                kontrol = false;
                break;
            }
        }
        try{
            if(kontrol){
                throw new BoyutTasmaHatasi("Boyut tasma hatasi");
            }
        }catch(BoyutTasmaHatasi exception){
            System.out.println(exception);
        }
    }
    
    @Override
    public void kartOdeme(Seans s){
        if (getYas() >= 18){
            if (getBakiye() >= s.getFilm().getUcret()*8/10)
                satinAl(s);
            else
                System.out.println("Yetersiz bakiye");
        }
        else
            System.out.println("18 yasindan kucuklar kart ile odeme yapamaz");
    }
    
    @Override
    public void nakitOdeme(Seans s){
        if (getBakiye() >= s.getFilm().getUcret()*8/10)
            satinAl(s);
        else
            System.out.println("Yetersiz bakiye");
    }
}
