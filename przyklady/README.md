# Programowanie Obiektowe - Java
## MiNI PW, Wiosna 2019/2020


Przydatne w zadaniach:

- instanceof
```java
Przesylka przesylka = lista.get(i);
if (przesylka instanceof List) {
   /// do somethimg
}
```

- zmienna liczba argumentow
```java
 // deklaracja
 public void myMethod(String... strings){
    // method body
 }

 // wolanie
 myMethod(); // Likely useless, but possible
 myMethod("one", "two", "three");
 myMethod("solo");
 myMethod(new String[]{"a", "b", "c"});
```

