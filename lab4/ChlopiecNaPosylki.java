package mini.java.poczta;

public class ChlopiecNaPosylki extends Doreczyciel {

    public ChlopiecNaPosylki(Poczta poczta) {
        super(poczta, 5);

        super.niePrzyjmuje(Wezwanie.class);
        super.niePrzyjmuje(Przekaz.class);
        super.niePrzyjmuje(Paczka.class);

        super.dostarczam(PrzesylkaListowa.class, 0.7);
        super.dostarczam(Paczka.class, 0.7);
    }

}
