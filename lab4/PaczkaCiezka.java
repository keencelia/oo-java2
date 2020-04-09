package mini.java.poczta;

public class PaczkaCiezka  extends Paczka {

    private double weight;

    public PaczkaCiezka(Osoba nadawca, Osoba adresat, double weight, double... wymiary) {
        super(nadawca,adresat, wymiary);
        this.weight = weight;
    }

}
