
public class Soru6 {

    public static boolean kareMatrisMi(int[][] matris) {
        return matris.length == matris[0].length;
    }

    public static boolean simetrikMatrisKontrol(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (i == j) {
                    continue;
                } else if (matris[i][j] != matris[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matris = {{0, 1, 2}, {1, 0, 3}, {2, 3, 0}};

        if (kareMatrisMi(matris)) {
            boolean simetrikMatrisMi = simetrikMatrisKontrol(matris);

            System.out.println(simetrikMatrisMi);
        }else{
            System.out.println("Girilen Matris Kare Olmalıdır.");
        }

    }
}
