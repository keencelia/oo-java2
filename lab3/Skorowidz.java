package mini.java.biblioteka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Skorowidz {

    HashMap<Integer, Ksiazka> indexKsiazek = new HashMap<Integer, Ksiazka>();
    HashMap<Integer, Pozycja> indexNaPolce = new HashMap<Integer, Pozycja>();
    HashMap<String, List <Integer>> indexTytulow = new HashMap<String, List<Integer>>();
    HashMap<String, List<Integer>> indexAutorow = new HashMap<String, List<Integer>>();
    HashMap<Integer, Czytelnik> wypozyczone = new HashMap<Integer, Czytelnik>();

    public Skorowidz() {
    }

    public Pozycja utworz(Integer regal, Integer polka, Integer pozycja) {
        Pozycja p = new Pozycja(regal, polka, pozycja);
        return p;
    }

    public void dodaj(Ksiazka k, Skorowidz.Pozycja p) {
        if (indexKsiazek.get(k.getId()) == null) {
            indexKsiazek.put(k.getId(), k);
            List<Integer> l = indexTytulow.get(k.getId());
            if (l == null) {
                l = new ArrayList <Integer>();
                indexTytulow.put(k.getTytul(), l);
            }
            l.add(k.getId());

            for (int i = 0; i < k.getLiczbaAutorow(); i++) {
                l = indexAutorow.get(k.getAutor(i));
                if (l == null) {
                    l = new ArrayList <Integer>();
                    indexAutorow.put(k.getAutor(i), l);
                }
                l.add(k.getId());
            }
        }

        if (indexNaPolce.get(k.getId()) != null) {
            indexNaPolce.replace(k.getId(), p);
        }
        else {
            indexNaPolce.put(k.getId(), p);
        }

        if (wypozyczone.containsKey(k.getId())) {
            wypozyczone.remove(k.getId());
        }

    }

    public Pozycja znajdz(String tytul) {

        List<Integer> l = indexTytulow.get(tytul);

        if (l.isEmpty()) {
            System.out.println("Nie mamy takiej ksiazki");
            return null;
        }

        Pozycja p = null;
        for (Integer id: l) {
            p = indexNaPolce.get(id);
            if (p != null) {
                break;
            }
        }

        if (p == null) {
            System.out.println("Ksiazka wypozyczona");
            return null;
        }
        return p;
    }

    public Pozycja znajdz(String tytul, String [] autor) {
        // TODO:
        return null;
    }

    public Ksiazka wypozycz(Integer id, Czytelnik c) {

        Ksiazka k = indexKsiazek.get(id);

        if (k == null) {
            System.out.println("Nie ma ksiazki");
            return null;
        }

        if (indexNaPolce.get(k.getId()) != null) {
            indexNaPolce.remove(k.getId());
        }

        if (wypozyczone.get(k.getId()) != null) {
            wypozyczone.replace(k.getId(), c);
        }
        else {
            wypozyczone.put(k.getId(), c);
        }

        return k;

    }

    public Set <String> getTytuly() {
        return indexTytulow.keySet();
    }

    public Set<String> getAutorzy() {
        return indexAutorow.keySet();
    }


    class Pozycja {
        protected int regal;
        protected int polka;
        protected int pozycja;

        public Pozycja(int regal, int polka, int pozycja) {
            this.regal = regal;
            this.polka = polka;
            this.pozycja = pozycja;
        }

        public int getRegal() {
            return regal;
        }

        public void setRegal(int regal) {
            this.regal = regal;
        }

        public int getPolka() {
            return polka;
        }

        public void setPolka(int polka) {
            this.polka = polka;
        }

        public int getPozycja() {
            return pozycja;
        }

        public void setPozycja(int pozycja) {
            this.pozycja = pozycja;
        }


    }
}
