package mini.java.poczta;

public class Wezwanie extends Przesylka {

    private String tresc;
    private String pouczenie;

    public Wezwanie(Osoba nadawca, Osoba adresat, String tresc, String pouczenie) {
        super(nadawca,adresat);
        this.tresc = tresc;
        this.pouczenie = pouczenie;
    }
}
