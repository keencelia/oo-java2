package mini.java.poczta;

public class Osoba {
    private String imie;
    private String nazwisko;

    private Adres adres;


    public Osoba(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = new Adres();
    }

    public Osoba() {
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
        this.adres = new Adres();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String toString() {
        return imie + " " + nazwisko + adres.toString();
    }

    public static class Adres {
        private String street;
        private String streetNumber;
        private String house;
        private String kod;
        private String city;
        private String kraj;

        public Adres(String... arr) {
            if (arr.length > 0) street = arr[0];
            if (arr.length > 1) streetNumber = arr[1];
            if (arr.length > 2) house = arr[2];
            if (arr.length > 3) kod = arr[3];
            if (arr.length > 4) city = arr[4];
            if (arr.length > 5) kraj = arr[5];
        }

        public Adres() {
            // random;
            // TODO
        }

        public String toString() {
            String addr = street + " " + streetNumber + "/" + house + "," + kod + " " + city + ", " + kraj;
            return addr;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreetNumber() {
            return streetNumber;
        }

        public void setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
        }

        public String getHouse() {
            return house;
        }

        public void setHouse(String house) {
            this.house = house;
        }

        public String getKod() {
            return kod;
        }

        public void setKod(String kod) {
            this.kod = kod;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getKraj() {
            return kraj;
        }

        public void setKraj(String kraj) {
            this.kraj = kraj;
        }
    }

}
