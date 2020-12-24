import java.util.ArrayList;

public class Hayvan extends Canli {

    ArrayList<Canli> beslenmeListesi = new ArrayList<Canli>();

    public void beslen(Canli canli) {

        beslenmeListesi.add(canli);
        System.out.println(canli.get_isim() + " ile beslenildi");
    }
}


