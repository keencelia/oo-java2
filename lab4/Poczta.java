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

    public List <Przesylka> dajPrzesylki(Doreczyciel d) {
        return przesylki;
    }

    public boolean odbierzPrzesylki(List <Przesylka> przesylki) {
        this.przesylki.addAll(przesylki);
        return true;
    }

    public boolean odbierzPrzesylki(Przesylka przesylka) {
        this.przesylki.add(przesylka);
        return true;
    }



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
                d.pracuj();
            }
        }

        System.out.println("Zostalo " + przesylki.size() + " przesylek do dostarczenia");



    }


}
