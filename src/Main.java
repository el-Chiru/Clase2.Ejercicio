import java.util.*;
import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    public class Main {


    public static void main(String[] args) {
        List<String> listaDeCadenas = Arrays.asList("PeRRo", "MuNdo", "JaVa");

        Function<String, String> pasarAMayusculas = String::toUpperCase;
        Function<String, String> pasarAMinusculas = String::toLowerCase;

        List<String> listaEnMayusculas = Interface.cambiar(listaDeCadenas, pasarAMayusculas);
        System.out.println(listaEnMayusculas);

        List<String> listaEnMinusculas = Interface.cambiar(listaDeCadenas, pasarAMinusculas);
        System.out.println(listaEnMinusculas);
}}