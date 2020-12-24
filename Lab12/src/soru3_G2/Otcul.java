public class Otcul extends Hayvan {

    public Otcul(String isim, String tur) {
        set_isim(isim);
        set_tur(tur);
    }

    public void beslen(Canli canli) {
        if (canli instanceof Bitki) {
            super.beslen(canli);
        } else {
            System.out.println("Sadece ot ile beslenebilir");
        }
    }

}
