# Problem plecakowy – aplikacja konsolowa w Javie

## Wstęp

Projekt zawiera konsolową aplikację w języku **Java**, która rozwiązuje **nieograniczony problem plecakowy** (*Unbounded Knapsack Problem*) z wykorzystaniem algorytmu zachłannego.

Zadanie zostało zrealizowane w ramach laboratorium 5 przedmiotu **Platformy Programistyczne .NET i Java** na **Politechnice Wrocławskiej**.

---

## Opis funkcjonalności

Aplikacja umożliwia:

- generowanie losowych instancji problemu plecakowego z określonym ziarnem i zakresem wartości,
- ręczne podawanie konkretnej instancji,
- rozwiązanie problemu plecakowego metodą zachłanną (według stosunku wartość/waga),
- wykorzystanie wielu egzemplarzy tego samego rodzaju przedmiotu,
- testowanie poprawności działania za pomocą zestawu testów jednostkowych.

---

## Struktura projektu

Projekt zawiera następujące klasy:

- **Item.java** – Klasa modelująca przedmiot (id, waga, wartość).
- **Problem.java** – Klasa zawierająca dane instancji oraz metodę `solve`, która implementuje algorytm zachłanny.
- **Main.java** – Klasa z metodą `main`, prezentująca działanie programu dla wygenerowanej instancji.
- **ProblemTest.java** – Klasa testowa z pięcioma testami jednostkowymi.

---

## Testy jednostkowe

Testy jednostkowe zostały napisane w oparciu o bibliotekę **JUnit 5** i obejmują:

- sprawdzenie, czy zwrócono dokładnie tyle przedmiotów, ile podano przy tworzeniu instancji,
- sprawdzenie, czy zwrócono co najmniej jeden przedmiot, jeśli choć jeden mieści się w plecaku,
- sprawdzenie, czy zwrócono pustą listę, jeśli żaden przedmiot nie mieści się w plecaku,
- sprawdzenie, czy wszystkie wygenerowane przedmioty mają wagę i wartość w zadanym zakresie,
- sprawdzenie poprawności wyniku (suma wag i wartość) dla **ręcznie zdefiniowanej instancji**.

---

## Technologie

- Java 19
- Maven
- JUnit 5
- IntelliJ IDEA
