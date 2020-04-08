package mini.java.poczta;

public class Przekaz extends Przesylka {
    private double suma;

    public Przekaz(Osoba nadawca, Osoba adresat, double suma) {
        super(nadawca,adresat);
        this.suma = suma;
    }

}
