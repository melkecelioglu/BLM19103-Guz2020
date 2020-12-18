

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Feyza Kuruçay
 */
public class NewClass {
    
    public static void main(String[] args) {
        Magaza mgz = new Magaza("A mağazası",3);

        urun u1 = new urun("MyPhone_15735","Akıllı Telefon_Elektronik");
        System.out.println("Ürün 1 Ad: "+u1.getAd());
        System.out.println("Ürün 1 Id: "+u1.getId());
        System.out.println("Ürün 1 Açıklama: "+u1.getAciklama());
        System.out.println("Ürün 1 Kategori: "+u1.getKategori());
        mgz.urunEkle(u1);
        System.out.println("************************************************");

        for(int i =0; i<mgz.getUrunListesi().length;i++){

            urun urun = mgz.getUrunListesi()[i];
           if ( mgz.getUrunListesi() [i] != null){
            int indeks_1 =mgz.indeksBul(urun.getAd(),'_');
            int indeks_2 =mgz.indeksBul(urun.getAciklama(),'_');
            String yeni_ad = mgz.substring(urun.getAd(),-1,indeks_1-1);
            String yeni_id = mgz.substring(urun.getAd(),indeks_1);
            String yeni_aciklama = mgz.substring(urun.getAciklama(),-1,indeks_2-1);
            String yeni_kategori = mgz.substring(urun.getAciklama(),indeks_2);

            urun.bilgiVer(yeni_ad,yeni_id,yeni_aciklama,yeni_kategori);


            }
           else {
               System.out.println(i + ". ürün : "+ mgz.getUrunListesi()[i]);
           }


        }}






        
        

        
        
}

