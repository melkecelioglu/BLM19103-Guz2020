
public class Soru8 {
    
    public static boolean sirtNoktasiMi(int[][] matris, int satir, int sutun, int eleman) {
        
        for (int sutunNo = 0; sutunNo < matris[satir].length; sutunNo++) {
            if(eleman < matris[satir][sutunNo])
                return false;
        }
        
        for (int satirNo = 0; satirNo < matris.length; satirNo++) {
            if(eleman > matris[satirNo][sutun])
                return false;
        }
        
        return true;   
    }
    
    public static void main(String[] args) {
        
        int[][] matris = {
                            {9, 8, 7},
                            {5, 4, 2},
                            {6, 6, 7}};
        
        int sirtNoktasiEleman = 0;
        
        for (int satir = 0; satir < matris.length; satir++) {
            boolean sirtNoktasi = false;
            for (int sutun = 0; sutun < matris[0].length; sutun++) {
                sirtNoktasi = sirtNoktasiMi(matris, satir, sutun, matris[satir][sutun]);
                if(sirtNoktasi)
                    sirtNoktasiEleman = matris[satir][sutun];
            }
        }
        
        System.out.println("Sırt Noktası:" + sirtNoktasiEleman);
        
    }
}
