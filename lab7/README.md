# 2019/2020 - Zadanie 1 - Tablice, dziedziczenie i interfejsy

Twoim zadaniem jest zaimplementowanie dwóch klas TextPassword i PinPassword rozszerających klasę Password oraz klasy PasswordGroup - wszystkich rozszerzających interfejs Nameable - tak aby napisane testy jednostkowe wykonały się poprawnie. Sygnatury klas to:

```java
/***
* Klasa abstrakcyjna reprezentująca hasło
*/
abstract class Password {
    /***
    * Metoda sprawdza czy hasła są zgodne. Bierze pod uwagę typy zmiennych które są przekazywane
    */
    abstract boolean check(Object password);
}
```

```java
/***
* Klasa ta reprezentuje hasło tekstowe
*/
class TextPassword {
    private String password; // Hazło
}
```


```java
/***
* Klasa ta reprezentuje PIN (4 cyfry z przedziału 0-9)
*/
class PinPassword{
    private int[] password; // PIN
}
```

```java
/***
* Klasa ta reprezentuje grupę haseł
*/
public class PasswordGroup {
    Password[] passwords;
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



## Jak skutecznie zabrać się za rozwiązanie zadania
[Instrukcja ze zrzutami ekranu](https://github.com/Rughalt/mini-objective-java/wiki/Zadania-Punktowane)

## Powodzenia!
