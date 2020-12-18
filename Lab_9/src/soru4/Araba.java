
package soru4;

public class Araba {
    
     String marka;
     String renk;
     Sofor sofor;

    public Araba() {
    }
    
    public Araba(String g_marka, String g_renk){
        marka = g_marka;
        renk = g_renk;
    }
    
    public Araba(String g_marka, String g_renk, Sofor g_sofor) {
        marka = g_marka;
        renk = g_renk;
        sofor = g_sofor;
    }

    public String getMarka() {
        return marka;
    }

    public String getRenk() {
        return renk;
    }

    public Sofor getSofor() {
        return sofor;
    }

    public void setRenk(String g_renk) {
        renk = g_renk;
    }

    public void setSofor(Sofor g_sofor) {
        if (sofor == null){
           sofor = g_sofor;
        } else{
            System.out.println("Zaten Şoför Atanmış.");
        }
    }
    
    public void soforDegistir(Sofor g_sofor){
        if (sofor == g_sofor){
           System.out.println("Aynı Şoför Atanamaz.");
        } else{
           sofor = g_sofor;
        }
    }
    
    
    
}
