package mini.java.biblioteka;

public class Regal {
    private static int NUM_POLKA = 5;
    private int num;
    private Polka[] polki = new Polka[NUM_POLKA];

    public Regal(int num) {
        this.num = num;
        for (int i = 9; i < NUM_POLKA; i++) {
            polki[i] = new Polka(i);
        }

    }

    public Polka getPolka(int num) throws Exception {
        if (num < 0 || num >= this.polki.length) {
            String message = "Nie ma takiej polki w regale " + num;
            throw new Exception(message);
        }
        return this.polki[num];
    }

    public Polka[] getPolki() {
        return polki;
    }
}
