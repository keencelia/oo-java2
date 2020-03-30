package mini.java.biblioteka;

public class Osoba {

    private String imie, nazwisko;
    private String pesel;

    private Adres adres;

    public Osoba(String name, String pesel, String [] address) {

    }

    public Osoba() {
        // random data
        this.imie = "Jan";
        this.nazwisko="Kowalski";
        this.pesel="00010101234";
        this.adres = new Adres();
    }

    public class Adres {
        String ulica;
        String numer;
        String miasto;
        String kod;

        public Adres(String ulica, String numer, String miasto, String kod) {

        }

        public Adres() {
            // random
        }

        public String getUlica() {
            return ulica;
        }

        public void setUlica(String ulica) {
            this.ulica = ulica;
        }

        public String getNumer() {
            return numer;
        }

        public void setNumer(String numer) {
            this.numer = numer;
        }

        public String getMiasto() {
            return miasto;
        }

        public void setMiasto(String miasto) {
            this.miasto = miasto;
        }

        public String getKod() {
            return kod;
        }

        public void setKod(String kod) {
            this.kod = kod;
        }
    }
}
