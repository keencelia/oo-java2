package mini.java.basic.interfaces;

import java.util.List;

public abstract class AbstractTimeSeries<T> {
    List<T> data;


    String name;

    public AbstractTimeSeries(String name, List<T> data) {
        this.name = name;
        this.data = data;
    }


    /**
     * Dodaje obiekt do listy
     * @param o Obiekt do dodania
     */
    public void add(T o) {
        data.add(o);
    }


    /**
     * Usuwa obiekt z listy
     * @param i indeks obiektu to usunięcia
     */
    public void remove(int i) {
        data.remove(i);
    }


    /**
     * Zwraca obiekt z listy
     * @param i Indeks obiektu do zwrócenia
     * @return Obiekt na konkretnym miejscu
     */
    public T get(int i) {
        return data.get(i);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Tworzy nowy obiekt klasy T. Pozwala to na proste obejście problemu z inicjalizacją klasy generycznej jeżeli
     * klasy rozszerzające AbstractTimeSeries poprawnie zaimplementują tę metodę.
     * @return Nowy obiekt klasy T.
     */
    public abstract T createElementInstance();
}
