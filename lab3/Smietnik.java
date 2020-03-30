package mini.java.biblioteka;

import java.util.ArrayList;
import java.util.List;


public class Smietnik {
    private List<Ksiazka> ksiazki = new ArrayList <Ksiazka>();

    public Smietnik() {

    }

    public void addKsiazka(Ksiazka k) {
        ksiazki.add(k);
    }

    public List<Ksiazka> wyrzconeKsiazki() {
        return ksiazki;
    }

    public void Oproznij() {
        ksiazki.clear();
    }

    public void wypisz() {
        for (Ksiazka k: ksiazki) {
            String autorzy = "";
            for (int i = 0; i < k.getLiczbaAutorow(); i++) {
                autorzy += " ";
                autorzy += k.getAutor(i);
            }
            System.out.println(k.getTytul() + autorzy );
        }
    }


}
