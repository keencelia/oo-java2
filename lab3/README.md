# 2019/2020 - Zadanie 3 - Biblioteka

## Historia

W bibliotece znajdują się następujące elementy:
	*	Książki (zawierają informacje takie jak: tytuł, liczbę stron, rodzaj obwoluty (twarda, miękka), autorzy)
	*	Półki (zawierają w sobie informacje takie jak: unikalny numer danej półki oraz przechowywane książki)
	*	Regały (zawierają informacje takie jak: unikalny numer regału oraz półki, które się z nich znajdują)
	*	Bibliotekarz (imię i nazwisko)
	*	Czytelnik (imię i nazwisko)
	*	Skorowidz
	*	Śmietnik

Książka zawiera informacje takie jak: tytuł, liczba stron, rodzaj obwoluty (może być twarda lub miękka) oraz listę autorów. Może być stworzona poprzez zewnętrzne podanie jej parametrów lub automatycznie - parametry liczbowe są losowane z pewnych przedziałów, natomiast inne dane generowane z istniejących wartości. Każda książka posiada unikalny numer id, ustalany podczas jej tworzenia. Nie ma on informacji o świecie zewnętrznym. Może natomiast udostępnić (za pomocą metod) wszystkie przechowywane przez siebie dane.
Półka znajduje się w regale. Może przechowywać 20 ksiażek. Można do niej wstawić lub z niej wyjąć książkę. Półka nie posiada informacji o regale w którym się znajduje. Jest w stanie zwrócić (za pomocą metod) wszystkie przechowywane przez siebie książki.
Regał zawiera 10 półek. Jako obiekt nic "nie wie" o istnieniu bytów takich jak: książki i bibliotekarz. Może natomist zwrócić wszystkie posiadane przez siebie półki (za pomocą metod).
Biblioteka, posiada 5 regałów i bibliotekarza.
Bibliotekarz ma dostęp do regałów, półek i książek. Wie o ich istnieniu. Może wstawiać i pobierać książki. Udostępnia metody, które mogą być wywołane przez czytelnika.
Czytelnik wie o bibliotece, książkach i bibliotekarzu, za którego pośrednictwem wypożycza i oddaje książki. Może ich na raz wypożyczyć do 5-ciu sztuk.
Do Skorowidza trafiają aktualne lokalizacje książek.
Do Śmietnika trafiają książki, które nie mogą być wstawione do półki (np. kolejna próba wstawienia książki się nie powiodła)

### Możliwe akcje:
####	Bibliotekarz:
	*	Tworzy nową książkę w oparciu o wylosowane parmetry (5 gotowych tytułów, autorów i wszystkich innych potrzebnych elementów)
	*	Wstawia książkę do pierwszego wolnego miejsca na półce w regale i wypisuje stosowny komunikat. Jeżeli nie ma miejsca, to bezowocnie kończy operację i wyświetla na konsoli stosowany komunikat.
	*	Wstawia książkę do losowo wybranego miejsca (regału, półki i miejsca w półce). Jeżeli miejsce jest już zajęte (stoi tam inna książka) ponawia proces. W przypadku powtórzenia się tej samej sytuacji, to bezowocnie kończy operację i wyświetla na konsoli stosowany komunikat.
	*	Poszukuje książki o zadanym tytule. W przypadku powodzenia zwraca znalezioną pozycję. W przeciwnym wypadku operacja nie zostaje wykonana.
	*	Wypisuje na konsolę listę wszystkich książek wraz z ich lokalizacją.
	*	Wypisuje na konsolę listę książek w śmietniku.
####	Czytelnik:
	*	Wypożycza pierwszą lepszą książkę
	*	Wypożycza książkę o zadanym tytule

### Scenariusz:
	1	Bibliotekarz tworzy losowo 100 książek
	2	Bibliotekarz wstawia 50 książek do losowych miejsc i 50 w trybie "pierwszy lepszy"
	3	10 Czytelników wypożycza losową liczbę (1-5) książek o zadanym tytule (wylosowanym z zestawu pięciu tytułów) (za pośrednictwem Bibliotekarza) książkę
	4	Bibliotekarz tworzy losowo 100 książek
	5	Bibliotekarz wstawia 50 książek do losowych miejsc i 50 w trybie "pierwszy lepszy"
	6	10 Czytelników wypożycza po kolei po książce czytelników wypożycza po jednej książce wylosowanej ze Skorowidza
	7	Wszyscy czytelnicy zwracają po kolei wszystkie książki. Bibliotekarz wstawia je z prawdopodobieństwem 0.5 do losowej półki w losowym regale. Jeśli
	8	Bibliotekarz wypisuje zawartość Biblioteki i Śmietnika

### Zestawy tytułów:
	1	Jeanne Boyarski, Scott Selikoff; Oracle Certified Professional; 655 stron; obwoluta miękka
	2	Daniel Defoe; Robinson Cruzoe; 321 stron; obwoluta twarda
	3	Adam Mickiewicz; Dziady; 111; obwoluta miękka
	4	Andreas M. Antonopoulos; Bitcoin dla zaawansowanych; 368; obwoluta miękka
	5	Anna Lewoc; Angielski dla specjalistów IT; 221; obwoluta twarda

### Uwagi:
	1	Każda z operacji jest logowana na konsolę.
	2	Każda nowa lokalizacja książki trafia do Skorowidza
	3	Po wypożyczeniu książki, jej miejsce pozostaje zwolnione (inna książka może zostać tam włożona). Po zwrocie książki zyskuje ona nowe położenie, wraz z aktualizacją skorowidza.
	4	W kwestiach nie regulowanych powyższymi specyfikacjami, obowiązuje dowolność wyboru.


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
