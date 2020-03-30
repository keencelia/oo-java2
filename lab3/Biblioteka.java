package mini.java.biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

    private static Biblioteka mainBiblioteka = new Biblioteka();
    private static int NUM_REGALY = 5;

    private Regal [] regaly = new Regal[NUM_REGALY];
    private Skorowidz skorowidz = new Skorowidz();
    private Smietnik smietnik = new Smietnik();

    private List<Czytelnik> czytelnicy = new ArrayList<Czytelnik>();
    private Bibliotekarz bibliotekarz = null;

    public static Biblioteka getBiblioteka() {
        return mainBiblioteka;
    }

    private Biblioteka() {
        for (int i = 0; i < NUM_REGALY; i++) {
            regaly[i] = new Regal(i);
        }
    }

    public Czytelnik zapisz(Osoba o) {
        Czytelnik czytelnik = new Czytelnik(o, this);
        czytelnicy.add(czytelnik);
        return czytelnik;
    }

    public void pracuje(Bibliotekarz b) {
        bibliotekarz = b;
    }

    public Bibliotekarz getBibliotekarz() {
        return this.bibliotekarz;
    }


    public Skorowidz getSkorowidz() {
        return this.skorowidz;
    }

    public Regal getRegal(int num) throws Exception{
        if (num < 0 || num >= this.regaly.length) {
            throw new Exception("Nie ma takiego regalu");
        }
        return this.regaly[num];
    }

    public Regal[] getRegaly() {
        return regaly;
    }

    public Smietnik getSmietnik() {
        return smietnik;
    }
}
