import java.io.FileNotFoundException;

public class zad24 {

    public static void main(String[] args) {

        Zwierze kot = new Zwierze();
        kot.setNazwa("mruczek");
        kot.setGatunek("ssak");
        kot.setMiesozerny(true);
        kot.setWiek(18);
        kot.setDlugosc(0.2D);
        kot.setSzerokosc(0.1D);

        Zwierze pies = new Zwierze();
        pies.setNazwa("azor");
        pies.setGatunek("ssak");
        pies.setMiesozerny(true);
        pies.setWiek(78);
        pies.setDlugosc(1D);
        pies.setSzerokosc(0.2D);

        Zwierze rybka = new Zwierze();
        pies.setNazwa("nemo");
        pies.setGatunek("ryba");
        pies.setMiesozerny(true);
        pies.setWiek(1);
        pies.setDlugosc(0.01D);
        pies.setSzerokosc(0.001D);

        Zwierze kon = new Zwierze("ssak","zdzislaw", true, 4, 120D, 40D);

        Zwierze papuga = new Zwierze("ptak","piratka", false, 2, 0.2, 0.01D);

        Zwierze zaginiony_golab = new Zwierze("miska");
        zaginiony_golab.setGatunek("ssak");
        zaginiony_golab.setMiesozerny(true);
        zaginiony_golab.setWiek(20);
        zaginiony_golab.setDlugosc(2D);
        zaginiony_golab.setSzerokosc(0.4D);
    }

}
