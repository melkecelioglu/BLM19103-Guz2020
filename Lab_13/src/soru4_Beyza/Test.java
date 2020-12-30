/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soru4;

/**
 *
 * @author ayza
 */
public class Test {
    public static void main(String[] args) {
        
        Gazete gazete1=new Gazete("Gunaydin",1999);
        

        Admin admin1=new Admin("Ahmet Ata ","ahmetata",gazete1);
        Yazar yazar1=new Yazar("Elif Lale ","elifale",gazete1);
        
        
        
        Haber haber1=new Haber(24,"Inanilmaz kaza ", "aciklama ", yazar1);
        
       
        admin1.haberEkle(haber1);
        admin1.bilgileriYazdir();
        admin1.haberSil(haber1);
        admin1.haberGuncelle(haber1, haber1.getAciklama());
        System.out.println("");
        yazar1.bilgileriYazdir();
     
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
