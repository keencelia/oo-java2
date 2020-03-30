package mini.java.biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Czytelnik {

    private Osoba osoba = null;
    private List <Ksiazka> mojeKsiazki = new ArrayList <Ksiazka>();
    private Biblioteka mojaBiblioteka;

    Czytelnik(Osoba o, Biblioteka b) {
        this.osoba = o;
        this.mojaBiblioteka = b;
    }

    public boolean wypozycz(String title) {
        Bibliotekarz b = mojaBiblioteka.getBibliotekarz();
        Ksiazka k = b.wypozycz(title);

        if (k != null) {
            mojeKsiazki.add(k);
            return true;
        }

        return false;
    }

    public boolean wypozycz(String title, String [] autorzy) {
        Bibliotekarz b = mojaBiblioteka.getBibliotekarz();
        Ksiazka k = b.wypozycz(title, autorzy);

        if (k != null) {
            mojeKsiazki.add(k);
            return true;
        }

        return false;
    }

    public boolean oddaj(Ksiazka k) {
        if (mojeKsiazki.contains(k)) {
            System.out.println("Nie mam takiej ksiazki");
            return false;
        }
        Bibliotekarz b = mojaBiblioteka.getBibliotekarz();
        b.oddaj(k);

        return mojeKsiazki.remove(k);
    }


}


