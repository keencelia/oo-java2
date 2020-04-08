package mini.java.poczta;

public class Listonosz extends Doreczyciel {

    public Listonosz(Poczta poczta) {
        super(poczta, 30);

        super.niePrzyjmuje(Anonim.class);
        super.dostarczam(PrzesylkaListowa.class, 0.7);
        super.dostarczam(Paczka.class, 0.7);
        super.dostarczam(Przekaz.class, 0.7);
    }
}
