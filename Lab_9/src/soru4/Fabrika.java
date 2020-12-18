
package soru4;

public class Fabrika {

    public Fabrika() {
    }
    
    public Araba arabaUret(){
        return new Araba();
    }
    
    public Araba arabaUret(String marka, String renk){
        return new Araba(marka, renk);
    }
    
    public Araba arabaUret(String marka, String renk, Sofor sofor){
        return new Araba(marka, renk, sofor);
    }
    
    public boolean ayniMi(Araba araba1, Araba araba2){
        boolean ayni = true;
        
        if (araba1.getMarka().equals(araba2.getMarka()) == false){
            ayni = false;
        }
        
        if (araba1.getRenk().equals(araba2.getRenk()) == false){
            ayni = false;
        }
        
        if (araba1.getSofor() != araba2.getSofor()){
            ayni = false;
        }
        
        return ayni;
        
    }
    
    public void arabaBoya(Araba araba, String renk){
        araba.setRenk(renk);
    } 
}
