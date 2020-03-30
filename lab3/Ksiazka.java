package mini.java.biblioteka;

public class Ksiazka {

    static int globalCounter = 0;

    private String tytul;
    private String [] autorzy;
    final Integer id;

    Ksiazka(String tytul, String... autorzy) {
        id = ++globalCounter;
        this.tytul = tytul;
        this.autorzy = autorzy;
    }

    public Integer getId() {
        return id;
    }

    public String getTytul() {
        return this.tytul;
    }

    public int getLiczbaAutorow() {
        return this.autorzy.length;
    }

    public String getAutor(int i) {
        if (i < 0 || i > this.autorzy.length) {
            System.err.println("Niepoprawny numer autora");
            // moze exception
            return null;
        }
        return this.autorzy[i];
    }



}
