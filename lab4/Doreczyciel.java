package mini.java.poczta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Doreczyciel {

    protected Poczta poczta;
    protected List <Przesylka> doDostarczenia = new ArrayList <Przesylka>();
    protected int maxPrzesylki = 100;

    protected boolean wpracy = true;
    protected boolean zajety = false;

    protected HashMap <Class, Boolean> akceptuje = new HashMap <Class, Boolean>();
    protected HashMap <Class, Double> dostarczam = new HashMap <Class, Double>();

    protected Doreczyciel(Poczta poczta) {
        this.poczta = poczta;
        poczta.addDoreczyciel(this);
    }

    protected Doreczyciel(Poczta poczta, int maxPrzesylki) {
        this.poczta = poczta;
        this.maxPrzesylki = maxPrzesylki;
        poczta.addDoreczyciel(this);
    }

    protected void niePrzyjmuje(Class c) {
        this.akceptuje.put(c, false);
    }

    protected void dostarczam(Class c, double p) {
        this.dostarczam.put(c, p);
    }

    public boolean isWpracy() {
        return wpracy;
    }

    public void setWpracy(boolean wpracy) {
        this.wpracy = wpracy;
    }

    public boolean isZajety() {
        return zajety;
    }

    public void setZajety(boolean zajety) {
        this.zajety = zajety;
    }

    public int getMaxPrzesylki() {
        return maxPrzesylki;
    }

    public int getIleMa() {
        return this.doDostarczenia.size();
    }

    public boolean akceptuje(Przesylka p) {
        Boolean a = null;
        Class c = p.getClass();

        while (c != null) {
            if ((a = akceptuje.get(c)) != null) break;
            c = c.getSuperclass();
        }

        if ((a != null && !a.booleanValue()))
            return false;
        return true;
    }

    protected double jakCzestoDostarczam(Przesylka p) {
        Double prob = dostarczam.get(p.getClass());
        Class c = p.getClass();
        while (c != null) {
            if ((prob = dostarczam.get(c)) != null) break;
            c = c.getSuperclass();
        }

        if (prob != null) return prob;
        return 1.0;
    }

    protected boolean pobierz() {
        List<Przesylka> przesylki = poczta.dajPrzesylki(this);
        doDostarczenia.addAll(przesylki);
        return (!doDostarczenia.isEmpty());
    }

    protected boolean dorecz() {
        List<Przesylka> niedostarczone = new ArrayList<Przesylka>();
        int dostarczone = 0;
        for (Przesylka p: this.doDostarczenia) {
            double prob = jakCzestoDostarczam(p);

            if (Math.random() > prob) {
                niedostarczone.add(p);
            }
            else {
                dostarczone++;
            }
        }
        System.out.println(this.getClass().getSimpleName().toString() +
                ": dostarczy1em " + dostarczone + " z " + this.doDostarczenia.size() + " przesylek");
        this.doDostarczenia.clear();
        return poczta.odbierzPrzesylki(niedostarczone);
    }


    public void doreczPrzesylki() {
        if (!wpracy || zajety) return;

        zajety = true;
        if (pobierz()) {
            dorecz();
        }
        zajety = false;
    }
}
