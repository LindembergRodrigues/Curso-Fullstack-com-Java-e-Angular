package PrincipaisStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class TesteStream {
    public static void  main( String [] args){
        List<String > numerosAle = Arrays.asList("12","20","34","58","6","4","26","25");
        System.out.println("Imprimir a sequência de numeros informados :: ");

        numerosAle.forEach(System.out::println);

        System.out.println("Os 5 primeiros numeros e coloque dentro de um set :");

        numerosAle.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println(" -- ");

        List<Integer> lista = numerosAle.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
                //.forEach(System.out::println);

        List<Integer> numerosAle2= numerosAle.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer %2 ==0 && integer > 2 ).collect(Collectors.toList());

        System.out.println(numerosAle2);

        System.out.println("Média - ");
        numerosAle.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remove os numeros ímpares - ");
        lista.removeIf(integer -> integer % 2 != 0);
    }
}
