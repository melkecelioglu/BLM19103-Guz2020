public class Test {

    public static void main(String[] args) {

        Bitki cimen = new Bitki("Çimen", "Bitki");

        Bitki bugday = new Bitki("Buğday", "Bitki");

        Etcil kaplan = new Etcil("Kaplan", "Hayvan");

        Otcul inek = new Otcul("İnek", "Hayvan");

        Hepcil karga = new Hepcil("Karga", "Hayvan");

        Hepcil tavuk = new Hepcil("Tavuk", "Hayvan");

        Hepcil insan = new Hepcil("İnsan", "Hepçil");

        tavuk.bilgiVer();
        bugday.bilgiVer();

        System.out.println("----------");

        karga.beslen(bugday);
        inek.beslen(insan);
        kaplan.beslen(cimen);


        insan.beslen(inek);
        insan.beslen(bugday);
        insan.beslen(tavuk);

        System.out.println("----------");

        int bitkiSayisi = 0;
        int hayvanSayisi = 0;
        for (int i = 0; i < insan.beslenmeListesi.size(); i++) {
            if (insan.beslenmeListesi.get(i) instanceof Bitki) {
                bitkiSayisi += 1;
            } else if (insan.beslenmeListesi.get(i) instanceof Hayvan) {
                hayvanSayisi += 1;
            }
        }

        System.out.println(insan.get_isim() + " adlı hepçilin beslendiği :\nhayvan sayısı = " + hayvanSayisi + ", " +
                "bitki sayısı = " + bitkiSayisi);

    }
}

