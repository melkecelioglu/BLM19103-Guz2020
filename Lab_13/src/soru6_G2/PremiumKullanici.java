/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author Tz Group
 */
public class PremiumKullanici extends Kullanıcı implements IUyeFirsatIslemleri {
    private int puandegeri;

    public PremiumKullanici(String ad, String soyad, int puandegeri) {
        super(ad, soyad);
        
        this.puandegeri = puandegeri;
    }

    
    @Override
    public void primeKullan(int urunSayisi){
        setPuandegeri(getPuandegeri() + urunSayisi * 5);
    }

    public int getPuandegeri() {
        return puandegeri;
    }

    public void setPuandegeri(int puandegeri) {
        this.puandegeri = puandegeri;
    }
}
