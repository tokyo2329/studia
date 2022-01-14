public class Zwierze {

    private String gatunek;
    private String nazwa;
    private Boolean miesozerny;
    private Integer wiek;
    private Double dlugosc;
    private Double szerokosc;

    public Zwierze(String _gatunek, String _nazwa, Boolean _miesozerny, Integer _wiek, Double _dlugosc, Double _szerokosc) {
        gatunek = _gatunek;
        nazwa = _nazwa;
        miesozerny = _miesozerny;
        wiek = _wiek;
        dlugosc = _dlugosc;
        szerokosc = _szerokosc;
    }

    public Zwierze() {
        gatunek = "ssak";
        miesozerny = true;
        wiek = 1;
        dlugosc = 1D;
        szerokosc = 1D;
    }

    public Zwierze(String _nazwa) {
        nazwa = _nazwa;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Boolean getMiesozerny() {
        return miesozerny;
    }

    public void setMiesozerny(Boolean miesozerny) {
        this.miesozerny = miesozerny;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public Double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(Double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public Double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(Double szerokosc) {
        this.szerokosc = szerokosc;
    }
}
