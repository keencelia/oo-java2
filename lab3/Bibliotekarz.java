package mini.java.biblioteka;

import java.util.Random;
import java.util.Set;

public class Bibliotekarz {

    private Osoba osoba;
    private Biblioteka biblioteka;

    public Bibliotekarz(Osoba o) {
        this.osoba = o;
    }

    public Bibliotekarz(Osoba o, Biblioteka b) {
        this.osoba = o;
        this.biblioteka = b;
    }

    public void pracujw(Biblioteka b) {
        this.biblioteka = b;
        b.pracuje(this);
    }

    public Ksiazka wypozycz(String title, String [] author) {
        // TODO:
        return null;
    }

    public Ksiazka wypozycz(String tytul, Czytelnik c) throws Exception {

        if (biblioteka == null) {
            throw new Exception("Bibliotekarz nie pracuje w bibliotece");
        }

        Skorowidz.Pozycja poz = biblioteka.getSkorowidz().znajdz(tytul);

        if (poz == null) {
            System.out.println("Nie mamy tej ksiazki");
            return null;
        }

        Regal regal = biblioteka.getRegal(poz.getRegal());

        if (regal== null) {
            throw new Exception ("Niepoprawny regal w skorowidzu");
        }

        Polka polka = regal.getPolka(poz.getPolka());

        Integer id = polka.usunKsiazke(poz.getPozycja());

        Ksiazka k = biblioteka.getSkorowidz().wypozycz(id,c);

        return k;
    }

    public boolean oddaj(Ksiazka k) throws Exception {

        if (biblioteka == null) {
            throw new Exception("Bibliotekarz nie pracuje w bibliotece");
        }

        Skorowidz skorowidz = biblioteka.getSkorowidz();

        Random ran = new Random();
        for (int attempts = 0; attempts < 3; attempts++) {
            int i = ran.nextInt(biblioteka.getRegaly().length);
            int j = ran.nextInt(biblioteka.getRegal(i).getPolki().length);

            Integer pozycja = biblioteka.getRegal(i).getPolka(j).dodajKsizka(k.getId());

            if (pozycja != null) {
                Skorowidz.Pozycja poz = skorowidz.utworz(i,j,pozycja);
                skorowidz.dodaj(k,poz);
                return true;
            }
        }

        biblioteka.getSmietnik().addKsiazka(k);

        return false;
    }

    public boolean dodaj(Ksiazka k) throws Exception {

        if (biblioteka == null) {
            throw new Exception("Bibliotekarz nie pracuje w bibliotece");
        }

        Skorowidz skorowidz = biblioteka.getSkorowidz();

        for (int attempts = 0; attempts < 3; attempts++) {
            for (int i = 0; i < biblioteka.getRegaly().length; i++) {
                for (int j = 0; j < biblioteka.getRegal(i).getPolki().length; j++) {
                    Integer pozycja = biblioteka.getRegal(i).getPolka(j).dodajKsizka(k.getId());

                    if (pozycja != null) {
                        Skorowidz.Pozycja poz = skorowidz.utworz(i,j,pozycja);
                        skorowidz.dodaj(k,poz);
                        return true;
                    }

                }
            }
        }

        biblioteka.getSmietnik().addKsiazka(k);

        return false;
    }

    public Ksiazka utworzKsiazka(String tytul, int strony, Ksiazka.Okladka okladka, String [] autorzy) {

        Ksiazka k = new Ksiazka(tytul, strony, okladka, autorzy);
        try {
            dodaj(k);
        }
        catch (Exception e) {
            // TODO:
        }
        return k;
    }


    public Ksiazka utworzKsiazka() {
        Random ran = new Random();
        String tytul=null, autor = null;

        Set <String> tytuly = biblioteka.getSkorowidz().getTytuly();

        if (tytuly.isEmpty()) {
            tytul = "Ballady i romanse";
        }
        else {
            int randomTytul = ran.nextInt(tytuly.size());
            tytul = (String) tytuly.toArray()[randomTytul];
        }

        Set <String> autorzy = biblioteka.getSkorowidz().getAutorzy();

        if (autorzy.isEmpty()) {
            autor = "Mickiewicz Adam";
        }
        else {
            int randomAutor = ran.nextInt(autorzy.size());
            autor = (String) autorzy.toArray()[randomAutor];
        }

        int strony = ran.nextInt(1000)+10;
        Ksiazka.Okladka okladka = Ksiazka.Okladka.values()[ran.nextInt(2)];

        Ksiazka k = new Ksiazka(tytul,strony, okladka,  autor);

        try {
            dodaj(k);
        }
        catch (Exception e) {
            // TODO:
        }
        return k;


    }

}
