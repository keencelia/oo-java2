# Programowanie Obiektowe - Java
## MiNI PW, Wiosna 2019/2020


Przydatne w zadaniach:

- instanceof
```java

if (Przesylka instanceof List) {
   /// do somethimg
}
```

- zmienna liczba argumentow

--Deklaracja funkcji:
```java
 public void myMethod(String... strings){
    // method body
}
```

--Wolanie funkcji:

```java
myMethod(); // Likely useless, but possible
myMethod("one", "two", "three");
myMethod("solo");
myMethod(new String[]{"a", "b", "c"});
```

