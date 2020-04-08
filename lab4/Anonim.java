package mini.java.poczta;

public class Anonim extends Przesylka {

    private String tresc;

    public Anonim(Osoba adresat, String tresc) {
        super(null, adresat);
        this.tresc = tresc;
    }
}
