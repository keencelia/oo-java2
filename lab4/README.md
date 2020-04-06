# 2019/2020 - Zadanie 4 - Poczta

##Poczta
Dany jest hipotetyczny model mocno uproszczonego urzędu pocztowego. Instytucja ta ma do rozdysponowania Paczki, Listy i Przekazy. Robi to za pomocą różnie zaawansowanych doręczycieli takich jak: listonosz, chłopiec na posyłki i kurier. Każdy z nich ma możliwość dostarczania różnych typów przesyłek, swoje własne zwyczaje i wymagania. Może się zdarzyć tak, że doręczyciel nie wykona zadania. Wtedy wraca Proces jest więc iteracyjny: Każdemu doręczycielowi poczta losuje maksymalną liczbę przesyłek, które może on zabrać na miasto (wybrane typy przesyłem). Następnie (z pewnym prawdopodobieństwem) roznosi on te przesyłki i wraca do urzędu. Zwraca niedoręczone przesyłki do głównej puli. W kolejnej iteracji proces się powtarza... do skutku.

Poczta dostarcza następujące rodzaje przesyłek, które zawierają wymienione poniżej informacje:
1.	List zwykły:
*	Treść (ciąg znaków)
*	Nadawca (imię i nazwisko, adres)
*	Postscriptum (ciąg znaków)
*	Podpis (ciąg znaków)
*	Adresat(imię i nazwisko, adres)

2.	Wezwanie:
*	Nadawca (imię i nazwisko, adres)
*	Treść (ciąg znaków)
*	Pouczenie (ciąg znaków)
*	Adresat(imię i nazwisko, adres)

3.	List miłosny:
*	Treść (ciąg znaków)
*	Inicjały (Dwie litery)
*	Adresat(imię i nazwisko, adres)

4.	List anonimowy:
*	Treść (ciąg znaków)
*	Adresat(imię i nazwisko, adres)

5.	Przekaz:
*	Kwota (do 10 000)
*	Adresat(imię i nazwisko, adres)
*	Nadawca (imię i nazwisko, adres)

6.	Przekaz walutowy:
*	Kwota (do 10 000)
*	Adresat(imię i nazwisko, adres)
*	Symbol waluty (ciąg znaków)
*	Nadawca (imię i nazwisko, adres)

7.	Paczka miękka:
*	Adresat(imię i nazwisko, adres)
*	Nadawca (imię i nazwisko, adres)

8.	Paczka twarda:
*	Wymiary (szerokość, wysokość, głębokość)
*	Nadawca (imię i nazwisko, adres)
*	Adresat(imię i nazwisko, adres)

9.	Paczka ciężka:
*	Adresat(imię i nazwisko, adres)
*	waga (liczba do 100)
*	Nadawca (imię i nazwisko, adres)

Poczta zatrudnia wymienionych poniżej pracowników:
1.	Listonosz:
*	Jest w stanie roznosić wszystkie rodzaje przysyłek z wyjątkiem anonimów.
*	Za jednym razem może ich zabrać 30.
*	Dostarcza przesyłki z następującym prawdopodobieństwem:
	* 	Listy - 0,7
	* 	Paczki - 0,7
	* 	Przekazy - 0,5
*	Przesyłki, których nie dostarczył, zanosi z powrotem na pocztę i zwraca do puli przesyłek.

2.	Kurier:
*	Roznosi paczki i listy.
*	Za jednym razem może ich zabrać 30.
*	Dostarcza przesyłki z następującym prawdopodobieństwem:
	* 	Listy - 0,7
	* 	Paczki - 0,7
	* 	Przekazy - 0,5
*	Przesyłki, których nie dostarczył, zanosi z powrotem na pocztę i zwraca do puli przesyłek.

3.	Chłopiec na posyłki:
*	Roznosi paczki i listy.
*	Za jednym razem może ich zabrać 5.
*	Dostarcza przesyłki z następującym prawdopodobieństwem:
	*	Listy - 0,7
	*	Paczki - 0,7
*	Przesyłki, których nie dostarczył, zanosi z powrotem na pocztę i zwraca do puli przesyłek.


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
