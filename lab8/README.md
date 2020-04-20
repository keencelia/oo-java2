# 2019/2020 - Zadanie 8 - Generyki i pliki

Twoim zadaniem jest napisanie dwóch klas implementujących metody tak, 
aby napisane testy jednostkowe wykonały się poprawnie. Sygnatury klas to:

```java
/***
* Klasa ta reprezentuje tablice obiektów na których oblicza kwantyle
*/
class Kwantylator <T extends ?> {
    private T[] data; // Dane 
    
    public median() {}; // Zwraca medianę
    public kwantyl(double p)() {}; // Zwraca kwantyl dla p: p w przedziale [0,1]
}
```

```java
/***
* Klasa ta pozwala obliczac kwantyle dla danych typu Double z pliku
*/
class FileKwantylator  {
    private Double [] data; // Dane 
    
    public median() {}; // Zwraca medianę
    public kwantyl(double p) {}; // Zwraca kwantyl dla p: p w przedziale [0,1]
}
```

## Wskazówki
- Korzystaj z możliwości generowania kodu przez IntelliJ - ułatwia 
to w sposób znaczący pracę. 
- Pamiętaj o zasadach programowania obiektowego (nie dawaj dostępu do atrybutów i metod bez konieczności).
- Uruchamiaj testy zawsze korzystając z opcji debug. 
Dzieki temu ławiej jest znaleźć i zrozumieć dlaczego program nie działa tak jak trzeba.
Pamiętaj o możliwości stawiania breakpointów.
- Pamiętaj o umiejscowieniu kodu w odpowiednim pakiecie. 
Najprościej, jeśli utworzysz nowy projekt, dodasz plik z testem i pozwolisz `Alt+Enter` 
na nazwie pakietu wykonać swoją magię.


## Powodzenia!
