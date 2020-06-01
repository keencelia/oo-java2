# 2019/2020 - Zadanie 14 - Programowanie wielowątkowe


### Zadanie 1.

1. Skopiuj plik datafile.txt do głównego katalogu projektu

3. Zaimplementuj klasy Producer i Consumer, tak aby main() w klasie Process skompilował się i wykonał poprawnie.
   Producer (w swoim własnym wątku) czyta z pliku wyrazy (omija znaki przestankowe) oraz umieszcza w specjalnej kolekcji tylko słowa zawierające litery  dla konsumentów do pobrania w funkcji next(). Producer śpi 100ms po przeczytaniu każdej linii.
   Consumer (w swoim wątku) tworzy ciąg stringów w taki sposób, aby ostatnie litery poprzedniego wyrazu i pierwsze następnego były takie same (traktując duże i małe litery tak samo). Jeśli kolejny token uzyskany przez next() nie da się dopasować do ciągu, zwraca go do producenta używając funkcji putback(), która wstawia go na początek lub koniec kolejki (każde z prawdopodobieństwem 0.5).
   Consumer blokuje się gdy kolejka jest pusta, oraz kończy przetwarzanie gdy dostanie string wyznaczony jako końcowy (parametrem konstruktora). Wszystkie wątki muszą skończyć przetwarzanie na tym samym znaczniku.
Dobierz odpowiednie struktury do przechowywania danych (np. z pakietu java.util.concurrent). Pamiętaj o synchronizacji, albo poprzez użycie słowa kluczowego "synchronized" albo użycie odpowiednich kolekcji.

4. Klasa Process wypisuje zgromadzone ciągi stringów. Najdłuższy wygrywa.

5. Kilka wybranych metod klas Producer i Consumer. Dodaj konstruktory, i zrób z nich osobne wątki używając dziedziczenia lub interfejsu (preferowany sposób). Comsumer rejestruje się u Producenta, i przekazuje uzyskane id w funkcjach next() i putback().  

```java
    public class Producer {
	Integer register() {}
	String next(Integer id, String end) {}
	String putback(Integer id, String token) {}

    }
```
```java
    public class Consumer {
	List<String> getCollected() {}
	Integer getId() {}
    }
```
4. Uruchom Process (Run), który tworzy producenta i 5 konsumentów.
5. Prześlij output 


## Wskazówki
- Korzystaj z możliwości generowania kodu przez IntelliJ - ułatwia to w sposób znaczący pracę. 
- Pamiętaj o zasadach programowania obiektowego (nie dawaj dostępu do atrybutów i metod bez konieczności).
- Stosuj dziedziczenie między klasami, gdy ma to sens
- Uruchamiaj testy zawsze korzystając z opcji debug.  
Dzięki temu łatwiej jest znaleźć i zrozumieć dlaczego program nie działa tak jak trzeba.  Pamiętaj o możliwości stawiania breakpointów.
- Pamiętaj o umiejscowieniu kodu w odpowiednim pakiecie. 
Najprościej, jeśli utworzysz nowy projekt, dodasz plik z testem i pozwolisz `Alt+Enter` 
na nazwie pakietu wykonać swoją magię.

