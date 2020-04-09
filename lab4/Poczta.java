package mini.java.poczta;

import java.util.ArrayList;
import java.util.List;

public class Poczta {

    private static Poczta mainPoczta = new Poczta();

    private List <Doreczyciel> doreczyciele = new ArrayList <Doreczyciel>();
    private List<Przesylka> przesylki = new ArrayList<Przesylka>();


    private Poczta() {}

    public static Poczta getPoczta() {
        return mainPoczta;
    }

    public void addDoreczyciel(Doreczyciel d) {
        doreczyciele.add(d);
    }

    /**
     * ktoś dostarcza poczcie przesylki
     *
     * @param przesylki
     */
    public void pobierzPrzesylki(List <Przesylka> przesylki) {
        this.przesylki.addAll(przesylki);
    }

    // public List <Przesylka> dajPrzesylki() {
    //     return przesylki;
    // }

    public int ileMa() {
        return this.przesylki.size();
    }

    public List <Przesylka> dajPrzesylki(Doreczyciel d) {
        int ile=d.getIleMa();
        List<Przesylka> dlaDoreczyciela = new ArrayList<Przesylka>();
        List<String> nd = new ArrayList<String>(); // żeby nie duplikowac informacji

        for (int i = 0; i < przesylki.size() && ile < d.getMaxPrzesylki(); i++) {
            Przesylka p = przesylki.get(i);

            if (!d.akceptuje(p)) {
                if (!nd.contains(this.getClass().getSimpleName())) {
                    System.out.println(d.getClass().getSimpleName().toString() +
                            ": nie dostarcza " + p.getClass().getSimpleName().toString());
                    nd.add(this.getClass().getSimpleName());
                }
            } else {
                przesylki.remove(p);
                dlaDoreczyciela.add(p);
                ile++;
            }
        }

        return dlaDoreczyciela;
    }

    /**
     *
     * @param przesylki
     * @return
     */
    public boolean odbierzPrzesylki(List <Przesylka> przesylki) {
        this.przesylki.addAll(przesylki);
        return true;
    }

    /**
     *
     */
    public void doreczPrzesylki() {

        int pracuje = 0;
        int niepracuje = 0;
        for (Doreczyciel d: this.doreczyciele) {
            if (d.isWpracy() && !d.isZajety()) pracuje++;
            else niepracuje++;
        }

        System.out.println("Pracuje " + pracuje + " doreczycieli");
        if (niepracuje > 0)
        System.out.println("Nie pracuje " + niepracuje + " doreczycieli");

        System.out.println("Jest " + przesylki.size() + " przesylek do dostarczenia");

        for (Doreczyciel d: this.doreczyciele) {
            if (d.isWpracy() && !d.isZajety()) {
                d.doreczPrzesylki();
            }
        }

        System.out.println("Zostalo " + przesylki.size() + " przesylek do dostarczenia");

    }


}
