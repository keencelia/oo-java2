# 2019/2020 - Zadanie 6 - # Tablice i dziedziczenie 
# Autor: Antoni Sobkowicz

Twoim zadaniem jest napisanie dwóch klas implementujących metody tak, 
aby napisane testy jednostkowe wykonały się poprawnie. Sygnatury klas to:

```java
/***
* Klasa ta reprezentuje serie czasową z danymi
*/
class TimeSeries {
    private int[] data; // Dane w serii
    private String name; // Nazwa serii czasowej
    
    public getMaximum() {}; // Zwraca największą wartość z serii
    public average() {}; // Zwraca średnią
}
```

```java
/***
* Klasa ta reprezentuje serie czasową z danymi, nie posiadającą nazwy.
*/
class AnonymousTimeSeries {
    private int[] data; // Dane w serii
    
    public getMaximum() {}; // Zwraca największą wartość z serii
    public average() {}; // Zwraca średnią
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
