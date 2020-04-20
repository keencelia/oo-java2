# 2019/2020 - Zadanie 5 - Kasyno

## Gra hazardowa. 

### Opis
Należy zaprojektować interfejs gry hazardowej oraz gracza (zestaw metod i/lub atrybutów wspólny dla wszystkich gier hazardowych) i dla graczy. Zaprojektować jako "class", "abstract class" lub "interface". Wybór umieć uzasadnić (np w komentarzu).
Następnie zaimplementować jedną grę hazardową do wyboru:

#### jednoręki bandyta
Gracz obstawia trzy litery (od A do C) i kwotę za jaką gra (jest ona pobierana z jego konta na które wcześniej wrzucił pieniądze). Automat losuje trzy litery z przedziału (A-C).
Trafienie:
* Jednej litery powoduje, że na konto gracza przekazywana jest trzykrotność postawionej sumy.
* Dwóch liter powoduje, że na konto gracza przekazywana jest dziewięciokrotność postawionej sumy.
* Trzech liter powoduje, że na konto gracza przekazywana jest dwudziestokrotność postawionej sumy.

#### ruletka
Zawiera liczby 1:36 w dwóch kolorach, czarnym i czerwonym (18 w każdym kolorze) oraz 0. (Np. w prawdziwej ruletce kolor czarny: 2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35)
Gracz obstawia liczbę (od 1 do 36) lub kolor (czarny, czerwony) i kwotę za jaką gra (jest ona pobierana z jego konta na które wcześniej wrzucił pieniądze). 	Automat losuje liczbę (0:36). Jeśli 0, wygrywa zawsze kasyno.
Trafienie:
* Koloru powoduje, że na konto gracza przekazywana jest dwukrotność postawionej sumy.
* Liczby powoduje, że na konto gracza przekazywana jest dziesięciokrotność postawionej sumy.


#### oczko (blackjack) 
jak ktoś ma ochotę i zna reguły

Następnie zaimplementować dwóch graczy,  z dwoma strategiami:
* gracza ostrożnego, który wyznacza sobie budżet i stawia małe (losowe sumy) i gra aż wszystko przegra,  wtedy przestaje
* gracza stratega, który zaczyna od małej sumy (1),  podwaja zakład przy każdej przegranej, przy wygranej wraca do małej sumy, aż wygra określoną sumę albo zbankrutuje



### Obiekty:
1.	Gracz
* rejestruje się w kasynie (płaci za żetony, które umożliwiają mu grę)
* według strategii: 
	* wybiera zakład i kwotę, 
	* gra
	* sprawdza stan konta
* udostępnia: 
	* listę wszystkich zakładów
	* pozostały kapitał
	* sumę wygraną/przegraną
	
2.	Kasyno
* daje graczowi dostęp do automatu (automat ma swoje konto - 1000 jednostek i konto gracza)
* wypłaca pieniądze

3.	Automat do gry
Automat udostępnia operacje dla następujących osób przez odpowiednie interfejsy:
* Gracz:
	*	Wrzucenie pieniędzy do automatu (jednostek)
	*	Wypłacenie kwoty (wygranej lub tego, co z niej zostało)
	*	Obstawienie (np. zestawu liter, liczbę, kolor ) i postawienie kwoty
	*	Gra - maszyna losuje swoje liczby, porównuje z obstawionymi i dokonuje operacji finansowych pomiędzy swoim kontem, a kontem gracza
	*	Sprawdzenie stanu konta gracza

* Kasyno:
	*	Włączanie
	*	Wyłączanie
	*	Sprawdzenie stanu konta maszyny
	*	Reset - ilość pieniędzy na koncie zostaje ustawiona na 1000 jednostek


Wykonanie każdej z operacji znajduje odzwierciedlenie w napisie na konsoli o odpowiedniej treści.
Automat do gry (jako jeden obiekt) powinien udostępniać pewne podzbiory funkcjonalności (wymienione wcześniej), w zależności od użytkownika na nim pracującego. Dany użytkownik (gracz, serwisant, kasyno) posiada referencję pozwalającą na udostępnienie mu jedynie podzbioru wszystkich funkcjonalności (przewidzianych dla niego) dostarczanych przez Automat.

### Uwagi:
1.	Jeżeli gracz próbuje wykonać jakąś akcję, na niewłączonym automacie - nic się nie dzieje, bo automat jest wyłączony.
2.	Wszystkie akcje muszą mieć swoje odzwierciedlenie w logach (np. Gracz pisze: "Obstawiam takie a takie zestawy liter", "Obstawiam kolor"
3.	Gracz próbujący użyć opcji: "Graj", bez wcześniejszego obstawienia symboli i postawienia stawki otrzyma informację o tym, iż nie ma takiej możliwość.
4.	Podobnie w przypadku, kiedy będzie chciał postawić kwotą większą, niż ma na koncie maszyny (mniej niż wrzucił)
5.	Programista powinien zaimplementować zdroworozsądkowe walidacje w stylu wymienionych powyżej

### Scenariusz:
1.	Kasyno włącza maszynę do losowania
2.	Gracz stawia kwotę
3.	Obstawia losowo wybrane symbole
4.	Gra wg strategii
5.	Wypłaca
6.	+uznaniowo wybrane urozmaicenia


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

