package mini.java.poczta;

public class Paczka extends Przesylka {
    private double [] wymiary;

    public Paczka(Osoba nadawca, Osoba adresat, double... wymiary) {
        super(nadawca,adresat);
        this.wymiary = wymiary;
    }


}
