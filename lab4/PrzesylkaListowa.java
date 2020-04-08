package mini.java.poczta;

public class PrzesylkaListowa extends Przesylka {

    private String tresc;
    private String ps;
    private String podpis;

    public PrzesylkaListowa(Osoba nadawca, Osoba adresat, String tresc, String podpis, String ps) {
        super(nadawca,adresat);
        this.tresc = tresc;
        this.podpis = podpis;
        this.ps = ps;
    }

    public PrzesylkaListowa(Osoba nadawca, Osoba adresat, String tresc) {
        super(nadawca,adresat);
        this.tresc = tresc;
    }

}
