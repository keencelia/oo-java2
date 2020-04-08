package mini.java.poczta;

public class Kurier extends Doreczyciel {

    public Kurier(Poczta poczta) {
        super(poczta, 30);

        super.niePrzyjmuje(Wezwanie.class);

        super.dostarczam(PrzesylkaListowa.class, 0.7);
        super.dostarczam(Paczka.class, 0.7);
        super.dostarczam(Przekaz.class, 0.5);
    }
}
