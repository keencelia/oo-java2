# 2019/2020 - Zadanie 11 - Strumienie i elementy grafiki

### Zadanie 1.
Projektowanie. Klasa Klasterer jest źle zaprojektowana (być może zostało to przez niektórych zauważone). Popraw ewidentne błędy poprzez stworzenie hierarchii klas. Co będzie w klasie bazowej, jakie będą klasy pochodne? Czy jest dobry kandydat na metodę abstrakcyjną w klasie bazowej?


### Zadanie 2.
Strumienie, oraz elementy grafiki. Do grafiki użyjemy JavaFX, ale trzeba ten pakiet zainstalować (od wersji Java11, JavaFX ie jest już częścią standardowego  jdk).
Instalacja JavaFX, kroki:
  1. Tu (https://openjfx.io) znajdziesz pakiet z plikami jar dla javafx (redyrekcja z oracle.com), skopiuj do dowolnego katalogu, powiedzmy {path}
  
  2. Dodaj {path}/javafx-sdk-??.?.?/lib do listy bibliotek do kompilacji w IntelliJ: File-> Project Structure->Modules, +, Jar/Library, Stage: Compile, zastąp ? odpowiednią wersją

  3. W opcji Run -> Edit Configuration, dodaj parametr VM: 
  -p {path}/javafx-sdk-??.?.?/lib --add-modules javafx.base,javafx.graphics,javafx.controls

2. Skopiuj plik population.csv do głównego katalogu projektu

3. Zaimplementuj klasę DataSet używaną w PopGraphics (dodaj odpowiednie wyjątki), użyj załączonego pliku DataSet.java.
   Spróbuj użyć strumieni i map/filter/reduce/collect albo wyrażeń regularnych, map, czy jakiejkolwiek innej implementacji (wyszukiwanie może być liniowe, ale strumienie dają się "paralelizować").
```java
    public class DataSet {
        public DataSet (String filename, boolean hasHeader) {}
        public List<String> getColumn(String name, String ... criteria) {}
        public List<Long>  getColumnAsLong(String name, String ... critera) {}
    }
```
4. Uruchom PopGraphic (Run)
5. Dodaj inne funkcje wedle zainteresowań, np. dodaj selekcje miejsc i lat z listy.


## Wskazówki
- Korzystaj z możliwości generowania kodu przez IntelliJ - ułatwia to w sposób znaczący pracę. 
- Pamiętaj o zasadach programowania obiektowego (nie dawaj dostępu do atrybutów i metod bez konieczności).
- Stosuj dziedziczenie między klasami, gdy ma to sens
- Uruchamiaj testy zawsze korzystając z opcji debug.  
Dzięki temu łatwiej jest znaleźć i zrozumieć dlaczego program nie działa tak jak trzeba.  Pamiętaj o możliwości stawiania breakpointów.
- Pamiętaj o umiejscowieniu kodu w odpowiednim pakiecie. 
Najprościej, jeśli utworzysz nowy projekt, dodasz plik z testem i pozwolisz `Alt+Enter` 
na nazwie pakietu wykonać swoją magię.

