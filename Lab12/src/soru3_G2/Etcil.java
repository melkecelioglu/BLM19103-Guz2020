public class Etcil extends Hayvan {

    public Etcil(String isim, String tur) {
        set_isim(isim);
        set_tur(tur);
    }

    public void beslen(Canli canli) {
        if (canli instanceof Hayvan) {
            super.beslen(canli);
        } else {
            System.out.println("Sadece et ile beslenebilir");
        }
    }

}
