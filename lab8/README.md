# 2019/2020 - Zadanie 8 - Generyki i pliki

Twoim zadaniem jest napisanie dwóch klas implementujących metody tak, 
aby napisane testy jednostkowe wykonały się poprawnie. Sygnatury klas to:

```java
/***
* Klasa ta reprezentuje tablice obiektow
*/
class Kwantylator <T extends ?> {
    private T[] data; // Dane 
    
    public median() {}; // Zwraca mediane
    public kwantyl(double p)() {}; // Zwraca kwantyl p: p in (0,1)
}
```

```java
/***
* Klasa ta reprezentuje tablice zmiennych typu Double
*/
class FileKwantylator  {
    private Double [] data; // Dane 
    
    public median() {}; // Zwraca największą wartość z serii
    public kwantyl(double p) {}; // Zwraca kwantyl
}
```

## Wskazówki
- Korzystaj z możliwości generowania kodu przez IntelliJ - ułatwia 
to w sposób znaczący pracę. Pamiętaj, że kod nie skompiluje się jeżeli metod nie będzie - 
natomiast jeżeli nie będą nic robić, jedyne co może się stać to zły wynik testu 
(albo zawieszenie się maszyny - z tym zawsze trzeba się liczyć 😉)
- Uruchamiaj testy zawsze korzystając z opcji debug 🐛. 
Dzieki temu ławiej jest znaleźć i zrozumieć dlaczego program nie działa tak jak trzeba.
Pamiętaj o możliwości stawiania breakpointów 🛑.
- Pamiętaj o umiejscowieniu kodu w odpowiednim pakiecie. 
Najprościej, jeśli utowrzysz nowy projekt, dodasz plik z testem i pozwolisz `Alt+Enter` 
na nazwie pakietu wykonać swoją magię 


## Powodzenia!
