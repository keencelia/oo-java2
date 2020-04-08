package mini.java.poczta;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Process {

    static String [] imiona = {"Jan", "Anna", "Maria", "Krzysztof", "Jacek", "Ewa", "Katarzyna", "Antoni", "Szymon", "Beata"};
    static String [] nazwiska = {"Kowal", "Pula", "Kula", "Krawczyk", "Sowa", "Baran", "Szewczyk", "Lis", "Wilk", "Mickiewicz"};
    static String [] ulice = {"Marszalkowska", "Mickiewicza", "Al. Jerozolimskie", "Slowackiego", "Zwyciestwa", "Pulawska", "Rakowiecka", "Polna"};
    static String [] miasta = {"Warszawa", "Lodz", "Gdansk", "Poznan", "Katowice"};

    static Osoba makeOsoba() {
        Random ran = new Random();

        String imie = imiona[ran.nextInt(imiona.length)];
        String nazwisko = nazwiska[ran.nextInt(nazwiska.length)];

        String ulica = ulice[ran.nextInt(ulice.length)];
        int numer = ran.nextInt(200);
        int mieszkanie =  ran.nextInt(100);

        String miasto = miasta[ran.nextInt(miasta.length)];

        Osoba.Adres adres = new Osoba.Adres(ulica, Integer.toString(numer), Integer.toString(mieszkanie), "", miasto, "Polska");

        Osoba osoba = new Osoba (imie, nazwisko, adres);

        return osoba;

    }

    static public void main(String [] args) {

        Poczta poczta = Poczta.getPoczta();

        for (int i = 0; i < 10; i++) {
            Listonosz l = new Listonosz(poczta);
        }
        for (int i = 0; i < 5; i++) {
            Kurier k = new Kurier(poczta);
        }
        for (int i = 0; i < 2; i++) {
            ChlopiecNaPosylki chlopiec = new ChlopiecNaPosylki(poczta);
        }

        List <Przesylka> przesylki = new ArrayList <Przesylka>();

        for (int i = 0; i < 10; i++) {
            Przesylka p = new Anonim(makeOsoba(), "tresc"+i);
            przesylki.add(p);
        }

        for (int i = 0; i < 1000; i++) {
            Przesylka p = new PrzesylkaListowa(makeOsoba(), makeOsoba(), "tresc"+i, "Ja", null);
            przesylki.add(p);
        }

        for (int i = 0; i < 1000; i++) {
            Random ran = new Random();
            Przesylka p = new Paczka(makeOsoba(), makeOsoba(), ran.nextInt(20), ran.nextInt(20), ran.nextInt(20));
            przesylki.add(p);
        }

        for (int i = 0; i < 1000; i++) {
            Random ran = new Random();
            Przesylka p = new Przekaz(makeOsoba(), makeOsoba(), ran.nextDouble());
            przesylki.add(p);
        }
        for (int i = 0; i < 1000; i++) {
            Random ran = new Random();
            Przesylka p = new Wezwanie(makeOsoba(), makeOsoba(), "tresc"+i, "pouczenie"+i);
            przesylki.add(p);
        }

        poczta.pobierzPrzesylki(przesylki);
        poczta.doreczPrzesylki();

    }
}
