package mini.java.biblioteka;

public class Polka {
    private static int NUM_POZ = 20;
    private int num;

    private Integer[] ksiazki = new Integer[NUM_POZ];

    public Polka(int i) {
        this.num = i;
    }

    public boolean dodajKsiazke(Integer id, int pozycja) throws Exception {
        if (pozycja < 0 || pozycja >= NUM_POZ) {
            throw new Exception("Niepoprawna pozycja");
        }
        if (ksiazki[pozycja] != null) {
            return false;
        }

        ksiazki[pozycja] = id;

        return true;
    }

    public Integer dodajKsizka(Integer id) {
        Integer wolna = getWolnaPozycja();

        if (wolna == null) {
            return null;
        }

        ksiazki[wolna] = id;

        return wolna;
    }

    public Integer usunKsiazke(int pozycja) throws Exception {
        if (pozycja < 0 || pozycja >= NUM_POZ) {
            throw new Exception("Nie ma takiej pozycji");
        }
        Integer id = ksiazki[pozycja];
        ksiazki[pozycja] = null;
        return id;
    }

    public Integer getWolnaPozycja() {
        for (int i = 0; i < NUM_POZ; i++) {
            if (ksiazki[i] == null) {
                return i;
            }
        }
        return null;
    }

}
