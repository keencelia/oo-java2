# 2019/2020 - Zadanie 8 - Generyki, pliki, strumienie i wyjątki

Twoim zadaniem jest napisanie trzech klas implementujących metody tak, 
aby napisane testy jednostkowe wykonały się poprawnie. 
Dwa pliki z liczbami i obiektami (liczby.txt i obiekty.bin) muszą być umieszczone w odpowiednim katalogu
w projekcie. Obiekty.bin jest plikiem binarnym. Sygnatury klas to:

```java
/***
* Klasa ta reprezentuje tablice obiektów na których oblicza kwantyle typu I
*/
class Kwantylator <T extends ?> {
    private T[] data; // Dane 
    
    public median() {}; // Zwraca medianę
    public kwantyl(double p)() {}; // Zwraca kwantyl dla p: p w przedziale [0,1]
}
```

```java
/***
* Klasa ta pozwala obliczac kwantyle typu I dla danych typu Double z pliku
*/
class FileDoubleKwantylator  {
    private Double [] data; // Dane 

    public FileDoubleKwantylator(FileInputStream fin) {}
    
    public median() {} // Zwraca medianę
    public kwantyl(double p) {} // Zwraca kwantyl dla p: p w przedziale [0,1]
}
```

```java
/***
* Klasa ta pozwala obliczac kwantyle typu I dla danych typu My2DObject z pliku
*/
class FileObjectKwantylator  {
    private My2DObject [] data; // Dane 

    public FileObjectKwantylator(FileInputStream fin) {}
    
    public median() {} // Zwraca medianę
    public kwantyl(double p) {} // Zwraca kwantyl dla p: p w przedziale [0,1]
}
```

## Wskazówki
- Korzystaj z możliwości generowania kodu przez IntelliJ - ułatwia to w sposób znaczący pracę. 
- Pamiętaj o zasadach programowania obiektowego (nie dawaj dostępu do atrybutów i metod bez konieczności).
- Stosuj dziedziczenie między klasami, gdy ma to sens
- Uruchamiaj testy zawsze korzystając z opcji debug.  
Dzieki temu ławiej jest znaleźć i zrozumieć dlaczego program nie działa tak jak trzeba.  Pamiętaj o możliwości stawiania breakpointów.
- Pamiętaj o umiejscowieniu kodu w odpowiednim pakiecie. 
Najprościej, jeśli utworzysz nowy projekt, dodasz plik z testem i pozwolisz `Alt+Enter` 
na nazwie pakietu wykonać swoją magię.

