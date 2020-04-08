package mini.java.poczta;

public abstract class Przesylka {

    protected Osoba adresat;
    protected Osoba nadawca;

    protected Przesylka(Osoba nadawca, Osoba adresat) {
        this.adresat = adresat;
        this.nadawca = nadawca;

    }

    protected Przesylka(Osoba adresat) {
        this.adresat = adresat;
    }

    public String toString() {
        String desc = this.getClass().toString() + " od: " + this.nadawca.toString() + " do: " + this.adresat.toString();
        return desc;
    }

}
