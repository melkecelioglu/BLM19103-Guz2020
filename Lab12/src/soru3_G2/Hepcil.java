public class Hepcil extends Hayvan {

    public Hepcil(String isim, String tur) {
        set_isim(isim);
        set_tur(tur);
    }

    public void beslen(Canli canli) {
        if (canli instanceof Hayvan || canli instanceof Bitki) {
            super.beslen(canli);
        } else {
            System.out.println("Sadece et veya ot ile beslenebilir");
        }
    }

}
