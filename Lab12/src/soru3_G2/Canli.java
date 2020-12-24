public class Canli {
    private String _isim;
    private String _tur;

    public Canli() {
    }

    public Canli(String isim, String tur) {
        _isim = isim;
        _tur = tur;
    }

    public void set_isim(String isim) { _isim = isim; }

    public String get_isim() {
        return _isim;
    }

    public void set_tur(String tur) {
        _tur = tur;
    }

    public String get_tur() {
        return _tur;
    }

    public void bilgiVer() {
        System.out.println("Canlı nın ismi = " + _isim + "\nCanlı nın türü = " + _tur);
    }
}
