/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsoru;


/**
 *
 * @author berat
 */
public class LabSoru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Fabrika f1 = new Fabrika("abc", 1987);
        
         SUV suv = new SUV("A", "B", 50 , 1000);
         
         Sedan sedan = new Sedan("C","D", 25, 2000);
         
         Otomobil oto1 = f1.otoUret("Fiat", "Palio", 75, 1000);
         
         Otomobil oto2 = f1.otoUret("Toyota", "Palio", 75, 2000);
        
         Kullanici k1 = new Kullanici("Berat Alkın");
         
         Kullanici k2 = new Kullanici("Ahmet Yilmaz");
         
         f1.otoSat(oto1, k1);
         
         k1.aracListele();
         
         f1.otoSat(oto2, k2);
         
         k2.aracListele();
         
         f1.otoSayisi();
         
    }
}
    